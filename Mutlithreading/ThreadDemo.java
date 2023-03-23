package Mutlithreading;

// A thread can be created by two ways 
// Implementing Runnable interface
// Extending Thread class


//Runnable interface

class Thrd implements Runnable{

    @Override
    public void run() {
        synchronized (this){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }}
    }

}

//Thread class
public class ThreadDemo extends Thread {
    
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadDemo th = new ThreadDemo();
        th.start();
        Thrd t = new Thrd();
        Thread t2 = new Thread(t);
        t2.start();
    }
}

