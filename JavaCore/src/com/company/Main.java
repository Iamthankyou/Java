package com.company;

public class Main {
    static void insertSort(int [] list) {
        int tmp;
        int n = list.length;
        for (int i=1; i<n; i++) {
            int j=i;
            while ((j>0) && (list[j]>list[j-1])) {
                tmp = list[j];
                list[j] = list[j-1];
                list[j-1]=tmp;
                j--;

            }
        }
    }

    public static void main(String[] args) {
      
    }
}
