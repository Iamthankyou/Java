package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a=");
        int a = scanner.nextInt();
        System.out.print("b=");
        int b = scanner.nextInt();
        System.out.print("c=");
        int c = scanner.nextInt();

        if ( a <= 0 || b<=0 || c<=0 || a+b <= c || a+c<=b || c+b<=a) {
            throw new IllegalTriangleException("");
        }
    }
}
