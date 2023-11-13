package com.stackroute.arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class RearrangeArrayElementsAppTests {

    private ByteArrayOutputStream myOutStream;
    private static final String MESSAGE = "RearrangeArrayElements Should display rearranged array";
    private static final String ERROR_MESSAGE = "RearrangeArrayElements Should display 'Give proper input' message";

    @BeforeEach
    public void setUp() {
        myOutStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOutStream));
    }

    @AfterEach
    public void tearDown() {
        myOutStream = null;
    }

    @Test
    public void givenSortedArrayThenReturnResult() {
        String input = "6 1 2 3 4 5 6";
        String output = "6 1 5 2 4 3";
        ByteArrayInputStream myInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(myInputStream);
        RearrangeArrayElements.main(null);
        String actual = myOutStream.toString().trim().replaceAll(".*\n", "");
        assertEquals(output, actual, MESSAGE);
    }

    @Test
    public void givenSortedArrayWithNegativeValuesThenReturnResult() {
        String input = "8 -100 -62 -13 0 4 52 67 99";
        String output = "99 -100 67 -62 52 -13 4 0";
        ByteArrayInputStream myInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(myInputStream);
        RearrangeArrayElements.main(null);
        String actual = myOutStream.toString().trim().replaceAll(".*\n", "");
        assertEquals(output, actual, MESSAGE);
    }

    @Test
    public void givenSortedArrayOfLengthOneThenReturnResult() {
        String input = "1 4";
        String output = "4";
        ByteArrayInputStream myInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(myInputStream);
        RearrangeArrayElements.main(null);
        String actual = myOutStream.toString().trim().replaceAll(".*\n", "");
        assertEquals(output, actual, MESSAGE);
    }

    @Test
    public void givenUnSortedArrayThenReturnErrorString() {
        String input = "10 24 44 54 32 5 1 0 64 76 98";
        String output = "Give proper input";
        ByteArrayInputStream myInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(myInputStream);
        RearrangeArrayElements.main(null);
        String actual = myOutStream.toString().trim().replaceAll(".*\n", "");
        assertEquals(output, actual, ERROR_MESSAGE);
    }

    @Test
    public void givenInvalidArrayLengthThenReturnErrorString() {
        String input = "-8 -100 62 -13 0 4 52 67 99";
        String output = "Give proper input";
        ByteArrayInputStream myInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(myInputStream);
        RearrangeArrayElements.main(null);
        String actual = myOutStream.toString().trim().replaceAll(".*\n", "");
        assertEquals(output, actual, ERROR_MESSAGE);
    }

}
