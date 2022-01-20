package com.company;

import java.util.ArrayList;

public class BST<T extends Comparable<T>> {
    private ArrayList<T> tree;

    public BST(int size){
        tree =  new ArrayList<>(size);
//        for (int i=0; i<size; i++){
//            tree.add(null);
//        }
    }

    public void insert(T d){
        int i = 0;
        while (i < tree.size() && tree.get(i) != null) {
            if (d.compareTo(tree.get(i)) < 0)
                i = (2 * i) + 1;
            else
                i = (2 * i) + 2;
        }

        tree.set(i,d);
    }

    public int find(T d) {
        int i = 0;
        boolean found = false;

        while (i < tree.size()) {
            if (tree.get(i).compareTo(d) < 0)
                i = (2 * i) + 1;
            else if (d.compareTo(tree.get(i)) > 0)
                i = (2 * i) + 2;
            else {
                found = true;
                break;
            }
        }

        if (found){
            System.out.println(d + " found at " + i + ".");
            return i;
        }
        else {
            System.out.println(d + " not found.");
            return 0;
        }
    }

    public void traverse(int i) {
        if (i < tree.size() && tree.get(i) != null) {
            traverse((2 * i) + 1);
            System.out.print(tree.get(i) + " ");
            traverse((2 * i) + 2);
        }
    }

}
