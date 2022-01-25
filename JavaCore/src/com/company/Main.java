package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "\\([0-9]{2}\\)\\-\\([0][0-9]{9}\\)";
        String test = "(08)-(1002222222)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(test);
        System.out.println(matcher.matches());
    }
}
