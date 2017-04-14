public class WalkTalk {
    static boolean flag = true;

    public static void main(String[] args) {
        Talk talk = new Talk();
        Thread walk = new Thread(new Walk());
        talk.start();
        walk.start();
    }

    static class Walk implements Runnable {
        public synchronized void run() {
            for (int i = 0; i < 80; i++) {
                try {
                    while (flag) {
                        wait();
                    }
                    System.out.println("Walking   " + i);
                    Thread.sleep(200);
                    flag = false;
                    notify();
                } catch (InterruptedException e) {
                    System.err.println(e);
                }
            }
        }
    }

    static class Talk extends Thread {
        public synchronized void run() {
            for (int i = 0; i < 80; i++) {
                System.out.println("Talking   " + i);
                try {
                    Thread.sleep(200);
                    flag = true;
                    notify();
                    while (!flag) {
                        wait();
                    }
                } catch (InterruptedException e) {
                    System.err.print(e);
                }
            }
        }
    }
}