package org.sparta.bradleywilliams.sortingalgorithms;


import org.sparta.bradleywilliams.exceptions.ArrayEmptyException;
import org.sparta.bradleywilliams.interfaces.Sorter;

public class QuickSort implements Sorter {
    public void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private int partition(int arrayToSort[], int start, int end) {
        int pivot = arrayToSort[end];
        int i = (start-1);

        for (int j = start; j < end; j++) {
            if (arrayToSort[j] <= pivot) {
                i++;

                int temp = arrayToSort[i];
                arrayToSort[i] = arrayToSort[j];
                arrayToSort[j] = temp;
            }
        }

        int temp = arrayToSort[i+1];
        arrayToSort[i+1] = arrayToSort[end];
        arrayToSort[end] = temp;
        return i+1;
    }

    @Override
    public int[] sortArray(int[] arrayToSort) throws ArrayEmptyException {
        if (arrayToSort.length < 1) {
            throw new ArrayEmptyException("This array is empty!");
        }
        quickSort(arrayToSort,0, arrayToSort.length-1);
        return arrayToSort;
    }
}
