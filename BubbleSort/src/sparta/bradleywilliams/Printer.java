package com.bradleywilliams;

import java.util.Arrays;

public class Printer {
    public static void printBubbleSort(int[] array) {
        System.out.println("==================");
        Sorter bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.sortArray(array)));
        System.out.println("==================");
    }
}
