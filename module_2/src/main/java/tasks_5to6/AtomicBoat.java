package tasks_5to6;

/**
 * Created by Gleb_Yants on 01.06.2016.
 * Atomic Boat - presented Class with Ability of running with Atomic Engine.
 */
public class AtomicBoat {
    public static void main(String[] args) {
        AtomicBoat aB = new AtomicBoat();
        aB.new AtomicEngine().run();
    }

    class AtomicEngine {
        public void run() {

        }
    }
}
