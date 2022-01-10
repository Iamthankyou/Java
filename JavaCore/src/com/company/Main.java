package com.company;

import java.util.Scanner;

public class Main {

    private static int a[];

    private static boolean isPrime(int n){
        if (n==2 || n==3){
            return true;
        }

        if (n<=1 || n%2==0 || n%3==0){
            return false;
        }

        for (int i=5; i*i<=n; i+=6){
            if (n%i==0 || n%(i+2)==0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        a = new int[101];

        for (int i=0; i<=100; i++){
            a[i]=0;
        }

        for (int i=2; i<=100; i++){
            if (isPrime(i)){
                a[i] = 1;
                for (int j=i*i; j<=100; j++){
                    a[j]=0;
                }
            }
        }

        for (int i=2; i<=100; i++){
            if (a[i] == 1){
                System.out.println(i);
            }
        }
    }
}
