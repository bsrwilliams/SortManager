package org.sparta.bradleywilliams.interfaces;

import org.sparta.bradleywilliams.exceptions.ArrayEmptyException;

public interface Sorter {

    int[] sortArray(int[] arrayToSort) throws ArrayEmptyException;
}
