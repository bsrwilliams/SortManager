package org.sparta.bradleywilliams.sortingalgorithms;

import org.sparta.bradleywilliams.exceptions.ArrayEmptyException;
import org.sparta.bradleywilliams.interfaces.Sorter;

public class MergeSort implements Sorter {

    @Override
    public int[] sortArray(int[] arrayToSort) throws ArrayEmptyException {
        if (arrayToSort.length < 1) {
            throw new ArrayEmptyException("Array is empty!");
        }
        mergeSort(arrayToSort,0,arrayToSort.length-1);
        return arrayToSort;
    }

    public void mergeSort(int[] arrayToSort, int start, int end) {
        if (start < end) {
            int midpoint = (start+end)/2;
            mergeSort(arrayToSort, start, midpoint);
            mergeSort(arrayToSort,midpoint+1, end);
            merge(arrayToSort, start, midpoint, end);
        }
    }

    public static void merge(int[] arrayToSort, int start, int midpoint, int end) {
        int[] left = new int[midpoint-start+1];
        int[] right = new int[end-midpoint];

        for (int i = 0; i < left.length; ++i) {
            left[i] = arrayToSort[start+i];
        }

        for (int j = 0; j < right.length; ++j) {
            right[j] = arrayToSort[midpoint + 1 +j];
        }

        // Index pointers
        int i = 0, j = 0, k = start;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arrayToSort[k++] = left[i++];
            } else {
                arrayToSort[k++] = right[j++];
            }
        }

        // Adding the rest of the arrays
        while (i < left.length) {
            arrayToSort[k++] = left[i++];
        }

        while (j < right.length) {
            arrayToSort[k++] = right[j++];
        }
    }
}
