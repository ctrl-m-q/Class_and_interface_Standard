package com.company;

public class Threads extends Thread {
    private Thread t;
    private String threadName;

    Threads(String Name) {
        threadName = Name;
        System.out.println("Create thread" + threadName);
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

    public void run() {
        int total = 0;
        synchronized (this) {
            System.out.println("Running " + threadName);
            for (int i = 0; i < 100; i++) {
                total += i;
            }
            notify();
        }
    }
}
