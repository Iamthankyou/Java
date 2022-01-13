package com.company;

public class FizzBuzz {
    public static String fizzBuzz(int number) {
        if (checkDivision3(number) && checkDivision5(number)) {
            return "FizzBuzz";
        }
        else if (checkDivision3(number)) {
            return "Fizz";
        }
        else if (checkDivision5(number)) {
            return "Buzz";
        }
        else {
            return toText(number);
        }
    }

    private static String toText(int a) {
        String [] lessTen =
                {"muoi","mot","hai","ba","bon","nam","sau","bay","tam","chin"};
        if (a == 0) {
            return "khong";
        }
        else if (a < 10) {
            return lessTen[a];
        }
        else if (a == 10) {
            return "muoi";
        }
        else if (a < 20) {
            return "muoi " + lessTen[a % 10];
        }
        else {
            return lessTen[a/10]+ " " + lessTen[a%10];
        }
    }

    public static boolean checkDivision3(int number) {
        if (number % 3 == 0) {
            return true;
        }
        if (String.valueOf(number).indexOf("3") != -1) {
            return true;
        }
        return false;
    }
    public static boolean checkDivision5(int number) {
        if (number % 5 == 0) {
            return true;
        }
        if (String.valueOf(number).indexOf("5") != -1) {
            return true;
        }
        return false;
    }

}
