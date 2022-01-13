package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StopWatch a = new StopWatch();
        a.stop();

        System.out.println(a.getStartTime());
        System.out.println(a.getEndTime());
    }
}
