package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a,b,c: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        QuadraticEquation qe = new QuadraticEquation(a,b,c);
        if(qe.getDiscriminant()>0) {
            System.out.println("2*: " + qe.getRoot1() + ", "+ qe.getRoot2());
        } else if (qe.getDiscriminant() == 0) {
            System.out.println("1*: "+ qe.getRoot1());
        } else {
            System.out.println("0*");
        }
    }
}
