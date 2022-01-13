package com.company;

public class Main {

    static int deleteElement(int arr[], int n, int x)
    {
        int i;
        for (i=0; i<n; i++)
            if (arr[i] == x)
                break;

        if (i < n)
        {
            n = n - 1;
            for (int j=i; j<n; j++)
                arr[j] = arr[j+1];
        }

        return n;
    }

    public static void main(String[] args) {
        int arr[] = {11, 15, 6, 8, 9, 10};
        int n = arr.length;
        int x = 6;

        n = deleteElement(arr, n, x);

        System.out.println("Modified array is");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i]+" ");
    }
}
