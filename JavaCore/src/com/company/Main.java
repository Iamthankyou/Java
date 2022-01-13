package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] addX(int n, int arr[], int x)
    {
        int i;

        int newarr[] = new int[n + 1];

        for (i = 0; i < n; i++)
            newarr[i] = arr[i];

        newarr[n] = x;

        return newarr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[10];
        for (int i= 0; i<10; i++) {
            array[i]=i;
        }

        System.out.println("Value insert: ");
        int x = scanner.nextInt();
        int index = -1;

        do {
            System.out.println("Position insert: ");
            index = scanner.nextInt();
        } while (index<0 || index>=10);

        for (int i = index+1; i< array.length;i++) {
            array[i] = array[i-1];
        }

        array[index] = x;

        for (int m:array) {
            System.out.print(" "+m);
        }
    }
}
