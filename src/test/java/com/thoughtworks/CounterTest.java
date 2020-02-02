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
        assertEquals(counter.fizzBuzzWhizz(1),"1");
    }

    @Test
    public void should_return_Fizz_given_number_contain_7_and_multiple_of_3_and_5() {
        assertEquals(counter.fizzBuzzWhizz(75),"Fizz");
    }

    @Test
    public void should_return_Fizz_given_number_contain_7_and_multiple_of_3(){
        assertEquals(counter.fizzBuzzWhizz(72),"Fizz");
    }

    @Test
    public void should_return_Whizz_given_number_contain_7_and_multiple_of_7(){
        assertEquals(counter.fizzBuzzWhizz(77),"Whizz");
    }

    @Test
    public void should_return_Whizz_given_number_contain_7_and_multiple_of_7_and_5(){
        assertEquals(counter.fizzBuzzWhizz(70),"Whizz");
    }

    @Test
    public void should_return_BuzzWhizz_given_number_contain_5_and_multiple_of_3_and_7(){
        assertEquals(counter.fizzBuzzWhizz(35),"BuzzWhizz");
    }

    @Test
    public void should_return_Fizz_given_number_only_contain_3_and_multiple_of_5(){
        assertEquals(counter.fizzBuzzWhizz(30),"Fizz");
    }

    @Test
    public void should_return_Fizz_given_number_only_contain_3(){
        assertEquals(counter.fizzBuzzWhizz(31),"Fizz");
    }
}
