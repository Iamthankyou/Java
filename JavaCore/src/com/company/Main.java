package com.company;

import java.util.Scanner;

public class Main {

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
        int n=0;
        for (int i=2; n<20; i++){
            if (isPrime(i)){
                System.out.println(n+1+": " + i);
                n++;
            }
        }
    }
}
