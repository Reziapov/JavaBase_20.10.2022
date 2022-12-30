package com.hillel.reziapov.homeworks.homework18;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest {
    static int[] arrayTest;

    @BeforeAll
    static void beforeAll() {
        arrayTest = new int[]{4, 4, 4, 4};
    }

    @Test
    public void test1() {
        assertFalse(Array.arraySquare(null));
    }

    @Test
    public void test2() {
        assertFalse(Array.arraySquare(new int[0][0]));
    }

    @Test
    public void test3() {
        assertTrue(Array.arraySquare(new int[4][4]));
    }

    @Test
    public void test4() {
        double average = Array.arrayMean(new int[]{});
        assertEquals(0.0, average);
    }

    @Test
    public void test5() {
        double average = Array.arrayMean(null);
        assertEquals(0.0, average);
    }

    @Test
    public void test6() {
        double average = Array.arrayMean(arrayTest);
        assertEquals(4.0, average);
    }

}
