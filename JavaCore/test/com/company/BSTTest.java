package com.company;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BSTTest extends TestCase {

    BST<Integer> bst = new BST<>(100);

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @org.junit.jupiter.api.Test
    void insert() {
        bst.insert(8);
        bst.insert(7);
        bst.insert(9);
        bst.insert(7);

        bst.traverse(0);

        Assert.assertEquals("7 7 8 9", outputStreamCaptor.toString()
                .trim());
    }

    @org.junit.jupiter.api.Test
    void find() {
        Integer x = new Integer(8);
        int actual = bst.find(x);
        int expected = 2;
        // 0 0 0 0 0 0 0 0 0 0
        // 7 7 8

        Assert.assertEquals(actual,expected);
    }

    @org.junit.jupiter.api.Test
    void traverse() {
        Assert.assertEquals("7 7 8 9", outputStreamCaptor.toString()
                .trim());
    }
}