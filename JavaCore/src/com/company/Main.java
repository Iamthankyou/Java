package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = 0;
        do{
            System.out.println("Nhập vào tỉ giá");
            x = scan.nextInt();

        }
        while (x<0);

        int usd = 0;
        do{
            System.out.println("Nhập vào số USD");
            usd = scan.nextInt();

        }
        while (usd<0);

        DecimalFormat formatter = new DecimalFormat("###,###,###");

        System.out.println(formatter.format(usd*x)+" VNĐ");
    }
}
