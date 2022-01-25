package com.company;

public class NumberGenerator implements  Runnable{

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(this.hashCode() + "this is hashcode " + i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e) {
            System.out.println(this.hashCode() + " interrupted exception");
        }

        System.out.println(this.hashCode() + " is the end");
    }
}
