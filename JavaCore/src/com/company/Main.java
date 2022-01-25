package com.company;

public class Main extends Thread{
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new OddThread();
        Thread t2 = new EvenThread();

        Thread t = Thread.currentThread();

        t2.start();
        t2.join();
        t1.start();
        t1.join();

    }
}
