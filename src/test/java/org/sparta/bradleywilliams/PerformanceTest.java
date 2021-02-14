package org.sparta.bradleywilliams;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.sparta.bradleywilliams.binarytree.BinaryTreeAlgorithm;
import org.sparta.bradleywilliams.exceptions.ArrayEmptyException;
import org.sparta.bradleywilliams.printer.Printer;
import org.sparta.bradleywilliams.sortingalgorithms.BubbleSort;
import org.sparta.bradleywilliams.sortingalgorithms.MergeSort;

public class PerformanceTest {
    private final int[] unsortedArray = {12,15,8,4,10,13};

    @Test
    @DisplayName("Testing Bubble sort time complexity")
    public void testBubbleSortTimeComplexity() throws ArrayEmptyException {
        BubbleSort bubbleSort = new BubbleSort();
        long start = System.nanoTime();
        bubbleSort.sortArray(unsortedArray);
        long end = System.nanoTime();
        Printer.printTimeComplexity(end - start);
    }

    @Test
    @DisplayName("Testing Merge sort time complexity")
    public void testMergeSortTimeComplexity() throws ArrayEmptyException {
        MergeSort mergeSort = new MergeSort();
        long start = System.nanoTime();
        mergeSort.sortArray(unsortedArray);
        long end = System.nanoTime();
        Printer.printTimeComplexity(end - start);
    }

    @Test
    @DisplayName("Testing Binary Tree time complexity")
    public void testBinaryTreeTimeComplexity() {
        BinaryTreeAlgorithm binaryTree = new BinaryTreeAlgorithm();
        binaryTree.addElements(unsortedArray);
        long start = System.nanoTime();
        binaryTree.getSortedTreeAsc();
        long end = System.nanoTime();
        Printer.printTimeComplexity(end - start);
    }
}
