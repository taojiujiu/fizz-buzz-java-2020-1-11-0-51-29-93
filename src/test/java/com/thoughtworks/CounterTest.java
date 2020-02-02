package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CounterTest {
    Counter counter;

    @Before
    public void setUp() {
        counter = new Counter();
    }

    @Test
    public void should_return_1_given_number_1() {
        assertEquals("1", counter.fizzBuzzWhizz(1));
    }

    @Test
    public void should_return_Fizz_given_number_contain_7_and_multiple_of_3_and_5() {
        assertEquals("Fizz", counter.fizzBuzzWhizz(75));
    }

    @Test
    public void should_return_Fizz_given_number_contain_7_and_multiple_of_3() {
        assertEquals("Fizz", counter.fizzBuzzWhizz(72));
    }

    @Test
    public void should_return_Whizz_given_number_contain_7_and_multiple_of_7() {
        assertEquals("Whizz", counter.fizzBuzzWhizz(77));
    }

    @Test
    public void should_return_Whizz_given_number_contain_7_and_multiple_of_7_and_5() {
        assertEquals("Whizz", counter.fizzBuzzWhizz(70));
    }

    @Test
    public void should_return_BuzzWhizz_given_number_contain_5_and_multiple_of_3_and_7() {
        assertEquals("BuzzWhizz", counter.fizzBuzzWhizz(35));
    }

    @Test
    public void should_return_Fizz_given_number_only_contain_3_and_multiple_of_5() {
        assertEquals("Fizz", counter.fizzBuzzWhizz(30));
    }

    @Test
    public void should_return_Fizz_given_number_only_contain_3() {
        assertEquals("Fizz", counter.fizzBuzzWhizz(31));
    }

    @Test
    public void should_return_Fizz_given_number_multiple_of_3() {
        assertEquals("Fizz", counter.fizzBuzzWhizz(6));
    }

    @Test
    public void should_return_Fizz_given_number_multiple_of_5() {
        assertEquals("Buzz", counter.fizzBuzzWhizz(10));
    }

    @Test
    public void should_return_Fizz_given_number_multiple_of_7() {
        assertEquals("Whizz", counter.fizzBuzzWhizz(14));
    }


    @Test
    public void should_return_Fizz_given_number_contain_3() {
        assertEquals("Fizz", counter.fizzBuzzWhizz(31));
    }

    @Test
    public void should_return_Fizz_given_number_contain_5() {
        assertEquals("51", counter.fizzBuzzWhizz(51));
    }

    @Test
    public void should_return_Fizz_given_number_contain_7() {
        assertEquals("71", counter.fizzBuzzWhizz(71));
    }
}
