package com.thoughtworks;

public class Counter {

    public void call(int n) {
        for (int i = 0; i < n; i++) {
            String result = fizzBuzzWhizz(i + 1);
            System.out.println(result);
        }
    }

    protected String fizzBuzzWhizz(int i) {
        if (i % 3 == 0) {
            return "Fizz";
        }

        if (i % 7 == 0) {
            return "Whizz";
        }

        return String.valueOf(i);
    }


}
