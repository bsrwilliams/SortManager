package org.sparta.bradleywilliams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.sparta.bradleywilliams.exceptions.ArrayEmptyException;
import org.sparta.bradleywilliams.sortingalgorithms.BubbleSort;

public class BubbleSortTests {
    private final int[] emptyArray = {};
    private final int[] sortedArray = {4,8,10,12,13,15};
    private final int[] unsortedArray = {12,15,8,4,10,13};

    @Test
    @DisplayName("Testing an empty array")
    public void testArrayEmptyExceptionBubbleSort() {
        BubbleSort bubbleSort = new BubbleSort();
        Assertions.assertThrows(ArrayEmptyException.class, () -> bubbleSort.sortArray(emptyArray), "Array is empty!");
    }

    @Test
    @DisplayName("Testing correct output - Bubble sort")
    public void testBubbleSort() throws ArrayEmptyException {
        BubbleSort bubbleSort = new BubbleSort();
        Assertions.assertArrayEquals(sortedArray, bubbleSort.sortArray(unsortedArray));
    }

    @Test
    @DisplayName("Testing if array is already sorted")
    public void testSortedArray() throws ArrayEmptyException {
        BubbleSort bubbleSort = new BubbleSort();
        Assertions.assertArrayEquals(sortedArray, bubbleSort.sortArray(sortedArray));
    }

    @Test
    @DisplayName("Testing an array that contains negative values")
    public void testNegativeValues() throws ArrayEmptyException {
        BubbleSort bubbleSort = new BubbleSort();
        int[] negativeArray = {-3,-12,-20,-1,-6};
        int[] negativeArraySorted = {-20, -12, -6, -3, -1};
        Assertions.assertArrayEquals(negativeArraySorted, bubbleSort.sortArray(negativeArray));
    }
}
