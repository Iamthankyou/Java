package com.company;

public class Main {

    public static void main(String[] args) {
        int tmp;
        int a[] = {2,3,5,2,1,1,1,2,3,6,32,4,6};
        int n = a.length;

        for (int i=1; i<n; i++) {
            int j=i;
            while ((j>0) && (a[j]<a[j-1])) {
                tmp = a[j];
                a[j] = a[j-1];
                a[j-1]=tmp;
                j--;
            }

            System.out.println("The sorted: ");

            for (int k=0; k<=i;k++) {
                System.out.print(" "+ a[k]);
            }

            System.out.println();
        }
    }
}
