package com.stackroute.arrays;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class RearrangeArrayElementsTests {
    private RearrangeArrayElements rearrangeArrayElements;
    private static final String MESSAGE = "Check logic of the computeRearrangedArray method";
    private static final String NULL_MESSAGE = "Given input array as null, check logic of the computeRearrangedArray method";
    private static final String EMPTY_MESSAGE = "Given input array as empty, check logic of the computeRearrangedArray method";
    private static final String SIZE_MESSAGE = "Check logic of the inputArraySizeValidator method";
    private static final String ARRAY_MESSAGE = "Check logic of the inputArrayValidator method";

    @BeforeEach
    public void setUp() {
        rearrangeArrayElements = new RearrangeArrayElements();
    }

    @AfterEach
    public void tearDown() {
        rearrangeArrayElements = null;
    }

    @Test
    public void givenInputWithPositiveNumbersThenReturnResult() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] output = {6, 1, 5, 2, 4, 3};
        assertArrayEquals(output, rearrangeArrayElements.computeRearrangedArray(input), MESSAGE);
    }

    @Test
    public void givenInputWithNegativeNumbersThenReturnResult() {
        int[] input = {-10, -8, -7, -4, -2, -1};
        int[] output = {-1, -10, -2, -8, -4, -7};
        assertArrayEquals(output, rearrangeArrayElements.computeRearrangedArray(input), MESSAGE);
    }

    @Test
    public void givenInputWithZeroThenReturnResult() {
        int[] input = {-44, -14, -8, -7, -4, -2, -1, 0, 4, 9, 11, 21, 34};
        int[] output = {34, -44, 21, -14, 11, -8, 9, -7, 4, -4, 0, -2, -1};
        assertArrayEquals(output, rearrangeArrayElements.computeRearrangedArray(input), MESSAGE);
    }

    @Test
    public void givenInputArrayAsNullThenReturnResult() {
        assertNull(rearrangeArrayElements.computeRearrangedArray(null), NULL_MESSAGE);
    }

    @Test
    public void givenInputWithEmptyArrayThenReturnResult() {
        int[] input = {};
        assertNull(rearrangeArrayElements.computeRearrangedArray(input), EMPTY_MESSAGE);
    }

    @Test
    public void givenValidInputSizeThenReturnTrue() {
        int size = 5;
        assertTrue(rearrangeArrayElements.inputArraySizeValidator(size), SIZE_MESSAGE);
    }

    @Test
    public void givenInValidInputSizeThenReturnFalse() {
        int size = -4;
        assertFalse(rearrangeArrayElements.inputArraySizeValidator(size), SIZE_MESSAGE);
    }

    @Test
    public void givenInValidInputSizeAsZeroThenReturnFalse() {
        int size = 0;
        assertFalse(rearrangeArrayElements.inputArraySizeValidator(size), SIZE_MESSAGE);
    }

    @Test
    public void givenSortedArrayThenReturnTrue() {
        int[] input = {-44, -14, -8, -7, -4, -2, -1, 0, 4, 9, 11, 21, 34};
        assertTrue(rearrangeArrayElements.inputArrayValidator(input), ARRAY_MESSAGE);
    }

    @Test
    public void givenUnSortedArrayThenReturnFalse() {
        int[] input = {24, 44, 54, 32, 5, 1, 0, 64, 76, 98};
        assertFalse(rearrangeArrayElements.inputArrayValidator(input), ARRAY_MESSAGE);
    }

}
