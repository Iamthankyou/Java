package com.company;

import java.util.Collections;
import java.util.Scanner;

public class Main {

    static int CeilIndex(char A[], int l, int r, int key)
    {
        while (r - l > 1) {
            int m = l + (r - l) / 2;
            if (A[m] >= key)
                r = m;
            else
                l = m;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input string: ");
        String s = scanner.nextLine();

        char[] A = s.toCharArray();
        int size = A.length;
        char[] tailTable = new char[size];
        int len;

        tailTable[0] = A[0];
        len = 1;

        for (int i = 1; i < size; i++) {
            if (A[i] < tailTable[0])
                tailTable[0] = A[i];
            else if (A[i] > tailTable[len - 1])
                tailTable[len++] = A[i];
            else
                tailTable[CeilIndex(tailTable, -1, len - 1, A[i])] = A[i];
        }

        System.out.println(tailTable);
    }
}
