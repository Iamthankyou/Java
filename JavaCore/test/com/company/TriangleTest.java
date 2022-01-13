package com.company;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class TriangleTest {
    int a;
    int b;
    int c;
    int expected;

    public TriangleTest(int a, int b, int c, int expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2,2,2,1},
                {2,2,3,2},
                {3,4,5,3},
                {-1,2,1,0},
                {0,1,1,0}
        });
    }

    //    @org.junit.jupiter.api.Test
    @Test
    public void checkExistTriangle() {
        int result = Triangle.checkExistTriangle(this.a,this.b,this.c);
        assertEquals(this.expected,result);
    }
}