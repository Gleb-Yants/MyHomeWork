package task_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by Gleb_Yants on 03.07.2016.
 */
public class AccountManagement {
    /*
    For file transactions - first int is AccountFrom, second - AccountTo, third - sum of all transactions between AccFrom and AccTo
     */
    private static ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public static Account getAccount(int id) {
        readWriteLock.readLock().lock();
        ArrayList<Integer> al = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\My projects\\MyHomeWork\\module_7\\src\\main\\resources\\Transactions"))) {
            while (reader.ready()) {
                String tmp = reader.readLine();
                String[] tmp2 = tmp.split(" ");
                if (Integer.parseInt(tmp2[0]) == id) {
                    al.add(Integer.parseInt(tmp2[1]));
                    al.add(Integer.parseInt(tmp2[2]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        readWriteLock.readLock().unlock();
        return new Account(id, al);

    }

    public static void addTransaction(int from, int to, int sum) {
        readWriteLock.writeLock().lock();
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\My projects\\MyHomeWork\\module_7\\src\\main\\resources\\Transactions"))
        ) {
            boolean added = false;
            while (reader.ready()) {
                String tmp = reader.readLine();
                String[] tmp2 = tmp.split(" ");
                if (Integer.parseInt(tmp2[0]) == from && Integer.parseInt(tmp2[1]) == to && !added) {
                    sb.append(Integer.parseInt(tmp2[0]) + " " + Integer.parseInt(tmp2[1]) + " " + (Integer.parseInt(tmp2[2]) + sum) + "\n");
                    added = true;
                } else sb.append(tmp + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter writer = new FileWriter("C:\\My projects\\MyHomeWork\\module_7\\src\\main\\resources\\Transactions")) {
            writer.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        readWriteLock.writeLock().unlock();
    }
}
