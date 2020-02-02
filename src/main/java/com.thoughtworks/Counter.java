package com.thoughtworks;

public class Counter {

    public void call(int n) {
        for (int i = 0; i < n; i++) {
            String result = fizzBuzzWhizz(i + 1);
            System.out.println(result);
        }
    }

    String fizzBuzzWhizz(int i) {
        boolean isContain5 = String.valueOf(i).contains("5");
        boolean isContain7 = String.valueOf(i).contains("7");
        boolean isContain3 = String.valueOf(i).contains("3");

        if (isContain5) isContain3 = false;
        if (isContain7) isContain5 = false;

        String string = "";

        if ((!isContain5 && i % 3 == 0) || isContain3) {
            string += "Fizz";
        }

        if (!isContain7 && !isContain3 && i % 5 == 0) {
            string += "Buzz";
        }

        if (i % 7 == 0) {
            string += "Whizz";
        }

        return string.equals("") ? String.valueOf(i) : string;
    }

}
