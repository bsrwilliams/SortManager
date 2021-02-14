package org.sparta.bradleywilliams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.sparta.bradleywilliams.exceptions.ArrayEmptyException;
import org.sparta.bradleywilliams.sortingalgorithms.QuickSort;

public class QuickSortTests {
    private final int[] emptyArray = {};
    private final int[] sortedArray = {4,8,10,12,13,15};
    private final int[] unsortedArray = {12,15,8,4,10,13};

    @Test
    @DisplayName("Testing an empty array")
    public void testArrayEmptyException() {
        QuickSort quickSort = new QuickSort();
        Assertions.assertThrows(ArrayEmptyException.class, () -> quickSort.sortArray(emptyArray));
    }

    @Test
    @DisplayName("Testing correct output")
    public void testCorrectOutput() throws ArrayEmptyException {
        QuickSort quickSort = new QuickSort();
        Assertions.assertArrayEquals(sortedArray, quickSort.sortArray(unsortedArray));
    }

    @Test
    @DisplayName("Testing an array that contains negative values")
    public void testNegativeValues() throws ArrayEmptyException {
        QuickSort quickSort = new QuickSort();
        int[] negativeArray = {-3,-12,-20,-1,-6};
        int[] negativeArraySorted = {-20, -12, -6, -3, -1};
        Assertions.assertArrayEquals(negativeArraySorted, quickSort.sortArray(negativeArray));
    }
}
