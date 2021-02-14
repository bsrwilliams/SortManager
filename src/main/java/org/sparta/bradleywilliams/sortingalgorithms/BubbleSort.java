package org.sparta.bradleywilliams.sortingalgorithms;

import org.sparta.bradleywilliams.exceptions.ArrayEmptyException;
import org.sparta.bradleywilliams.interfaces.Sorter;

public class BubbleSort implements Sorter {
    @Override
    public int[] sortArray(int[] unsortedArray) throws ArrayEmptyException {
        if (unsortedArray.length < 1) {
            throw new ArrayEmptyException("Array is empty!");
        }

        boolean isSwapped;

        for (int i = 0; i < unsortedArray.length-1; i++) {
            isSwapped = false;
            for (int j = 0; j < unsortedArray.length-1-i; j++) {
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
