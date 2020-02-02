package com.thoughtworks;

public class Counter {

    public void call(int n) {
        for (int i = 0; i < n; i++) {
            String result = fizzBuzzWhizz(i + 1);
            System.out.println(result);
        }
    }

    protected String fizzBuzzWhizz(int i) {
        boolean isContain5 = String.valueOf(i).contains("5");
        boolean isContain7 = String.valueOf(i).contains("7");
        if(isContain7) isContain5 = false;

        String string = "";

        if (!isContain7 && i % 5 == 0) {
            string += "Buzz";
        }

        if (!isContain5 && i % 3 == 0) {
            return "Fizz";
        }

        if (i % 7 == 0) {
            string += "Whizz";
        }


        return string != "" ? string : String.valueOf(i);
    }


}
