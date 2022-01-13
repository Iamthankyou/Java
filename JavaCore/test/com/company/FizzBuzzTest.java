package com.company;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class FizzBuzzTest {

    int number;
    String expected;

    public FizzBuzzTest(int number, String expected) {
        this.number = number;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0,"FizzBuzz"},
                {1,"mot"},
                {2,"hai"},
                {3,"Fizz"},
                {4,"bon"},
                {5,"Buzz"},
                {80,"Buzz"}
        });
    }

    @Test
    public void fizzBuzz() {
        assertEquals(this.expected,FizzBuzz.fizzBuzz(this.number));
    }
}