package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int []a = {1,2,3,4,5};

        for (int i:a) {
            stack.push(i);
        }

        int i=0;
        while (!stack.isEmpty())
            a[i++] = stack.pop();
        }
    }
}
