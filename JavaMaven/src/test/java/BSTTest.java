import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class BSTTest{

    BST bst = new BST<Integer>(100);

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private Assertions Assert;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));

        bst.insert(8);
        bst.insert(7);
        bst.insert(9);
        bst.insert(7);
    }

    @org.junit.jupiter.api.Test
    void insert() {


        bst.traverse(0);

        Assert.assertEquals("7 7 8 9", outputStreamCaptor.toString()
                .trim());
    }

    @org.junit.jupiter.api.Test
    void find() {
//        insert();
        Integer x = new Integer(9);
        int actual = bst.find(x);
        int expected = 2;
        // 0 0 0 0 0 0 0 0 0 0
        // 7 7 8

        Assert.assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void traverse() {
        bst.traverse(0);
        Assert.assertEquals("7 7 8 9", outputStreamCaptor.toString()
                .trim());
    }

    @Test
    void delete() {
//        insert();
        bst.delete(8);

        bst.traverse(0);

        Assert.assertEquals("7 7 9", outputStreamCaptor.toString()
                .trim());
    }

    @Test
    void preOder() {
        bst.preOder(0);
        Assert.assertEquals("8 7 7 9", outputStreamCaptor.toString()
                .trim());
    }

    @Test
    void postOder() {
        bst.postOder(0);
        Assert.assertEquals("7 7 9 8", outputStreamCaptor.toString()
                .trim());
    }
}