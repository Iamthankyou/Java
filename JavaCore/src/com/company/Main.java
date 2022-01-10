package com.company;

import java.util.Scanner;

public class Main {

    private static int gcd(int a, int b){
        return b==0?a:gcd(b,a%b);
    }

    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);

        System.out.println("a=");
        a = scan.nextInt();
        System.out.println("b=");
        b = scan.nextInt();

        System.out.println("gcd(a,b) = " + gcd(a,b));
    }
}
