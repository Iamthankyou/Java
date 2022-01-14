package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        String test = "mot hai mot hai mot mot mot mot hai";
        test = test.toLowerCase(Locale.ROOT);

        for (String i:test.split(" ")){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        System.out.println(": ");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
