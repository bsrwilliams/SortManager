package com.bradleywilliams;

public class BubbleSort implements Sorter {
    /**
     * Bubble sort operates by comparing each value in a sequence of integers
     * against each other, deriving the smaller and larger values to be placed
     * in the correct index position order. (smallest -> largest)
     *
     * @param unsortedArray The array to be sorted
     */
    @Override
    public int[] sortArray(int[] unsortedArray) {
        if (unsortedArray.length <= 1) {
            return unsortedArray;
        }

        boolean isSwapped;

        for (int i = 0; i < unsortedArray.length-1; i++) {
            isSwapped = false;
            for (int j = 0; j < unsortedArray.length-1; j++) {
                if (unsortedArray[j] > unsortedArray[j+1]) {
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j+1];
                    unsortedArray[j+1] = temp;
                    isSwapped = true;
                }
            }

            if (!isSwapped) {
                break;
            }
        }
        return unsortedArray;
    }
}
