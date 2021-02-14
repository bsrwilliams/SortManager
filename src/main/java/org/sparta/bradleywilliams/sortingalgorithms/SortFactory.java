package org.sparta.bradleywilliams.sortingalgorithms;

import org.sparta.bradleywilliams.interfaces.Sorter;

public class SortFactory {
    public Sorter getSorter(SortTypes sortType) {
        if (sortType == null) {
            return null;
        } else if (sortType.equals(SortTypes.BUBBLE)) {
            return new BubbleSort();
        } else if (sortType.equals(SortTypes.MERGE)) {
            return new MergeSort();
        } else if (sortType.equals(SortTypes.QUICK)) {
            return new QuickSort();
        }
        return null;
    }
}
