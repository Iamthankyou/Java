package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "^[CAP][0-9][A-Za-z0-9]*[GHIKLM]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("P0123M");
        System.out.println(matcher.matches());
    }
}
