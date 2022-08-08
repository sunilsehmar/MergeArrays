package com.sparta.ss;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MergeSortTest {

    @Test
    @DisplayName("With the given array, return it sorted with Bubble")
    void givenArrayReturnTheSortedArray() {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8, 9, 10};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] answer = Merging.mergedArray(arr1, arr2);

        Assertions.assertArrayEquals(expected, answer);
    }
}