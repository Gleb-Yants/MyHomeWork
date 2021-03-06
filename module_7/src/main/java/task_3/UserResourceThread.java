package task_3;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Gleb_Yants on 09.07.2016.
 */

public class UserResourceThread {
    public static boolean main(String[] args) throws InterruptedException {
        SharedResource res = new SharedResource();
        IntegerSetterGetter t1 = new IntegerSetterGetter("1", res);
        IntegerSetterGetter t2 = new IntegerSetterGetter("2", res);
        IntegerSetterGetter t3 = new IntegerSetterGetter("3", res);
        IntegerSetterGetter t4 = new IntegerSetterGetter("4", res);
        IntegerSetterGetter t5 = new IntegerSetterGetter("5", res);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        Thread.sleep(100);

        t1.stopThread();
        t2.stopThread();
        t3.stopThread();
        t4.stopThread();
        t5.stopThread();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        System.out.println("main");
        return true;
    }
}

class IntegerSetterGetter extends Thread {
    public static final AtomicInteger counter = new AtomicInteger(0);
    public static final AtomicInteger threads = new AtomicInteger(4);
    private SharedResource resource;
    private boolean run;
    private Random rand = new Random();

    public IntegerSetterGetter(String name, SharedResource resource) {
        super(name);
        this.resource = resource;
        run = true;
    }

    public void stopThread() {
        run = false;
    }

    public void run() {
        int action;

        try {
            while (run) {
                action = rand.nextInt(1000);
                if (action % 2 == 0 & counter.intValue() < threads.intValue()) {
                    counter.incrementAndGet();
                    getIntegersFromResource();
                    counter.decrementAndGet();
                } else {
                    setIntegersIntoResource();
                }
            }
            threads.decrementAndGet();
            System.out.println("����� " + getName() + " �������� ������.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void getIntegersFromResource() throws InterruptedException {
        Integer number;

        synchronized (resource) {
            System.out.println("����� " + getName()
                    + " ����� ������� �����.");
            number = resource.getELement();
            while (number == null) {
                System.out.println("����� " + getName()
                        + " ���� ���� ������� ����������.");
                resource.wait();
                System.out
                        .println("����� " + getName() + " ���������� ������.");
                number = resource.getELement();
            }
            System.out
                    .println("����� " + getName() + " ������ ����� " + number);
        }
    }

    private void setIntegersIntoResource() throws InterruptedException {
        Integer number = rand.nextInt(500);
        synchronized (resource) {
            resource.setElement(number);
            System.out.println("����� " + getName() + " ������� ����� "
                    + number);
            resource.notify();
            Thread.sleep(5);
        }
    }
}




