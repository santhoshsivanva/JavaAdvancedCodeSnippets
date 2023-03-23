package Mutlithreading;


// Synchronization is built around an internal entity known as the intriscti lock
// or monitor lock (The API specification often refers to this entity simply as a "monitor")

public class Synchronization extends Thread {

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);

            }
        }
    }

    public static void main(String[] args) {
        Synchronization sc = new Synchronization();
        sc.start();
        Thread t = new Thread(new Thrd());
        t.start();
    }

}
