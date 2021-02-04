package com.bradleywilliams;

public class Starter {
    public static void start() {
        // Not sorted
        int[] notSorted = {2,5,1,8,4,6};
        Printer.printBubbleSort(notSorted);

        // Already sorted
        int[] sorted = {1,2,3,4,5,6};
        Printer.printBubbleSort(sorted);

        // Empty
        int[] empty = {};
        Printer.printBubbleSort(empty);

        // Negative values
        int[] negativeValues = {-5, -9, -3, -1, -7};
        Printer.printBubbleSort(negativeValues);
    }
}
