package com.company;

public class OddThread extends Thread{

    @Override
    public void run() {
        try {
            for (int i=0; i<10; i++) {
                if (i%2 ==0) {
                    System.out.println(this.hashCode() + "even  " +i);
                    Thread.sleep(10);
                }
            }
        } catch (Exception e) {
            System.out.println(this.hashCode() + " this is exception");
        }

        System.out.println(this.hashCode() + " is the end");
    }
}
