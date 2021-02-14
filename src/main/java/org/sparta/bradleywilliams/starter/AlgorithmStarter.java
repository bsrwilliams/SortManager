package org.sparta.bradleywilliams.starter;

import org.sparta.bradleywilliams.binarytree.BinaryTreeAlgorithm;
import org.sparta.bradleywilliams.exceptions.ArrayEmptyException;
import org.sparta.bradleywilliams.printer.Printer;
import org.sparta.bradleywilliams.sortingalgorithms.SortFactory;
import org.sparta.bradleywilliams.sortingalgorithms.SortTypes;

public class AlgorithmStarter {
    public static void sortingAlgorithm(SortTypes sortType) throws ArrayEmptyException {
        int[] unsortedArray = Starter.randomArray(10,1,15);
        SortFactory sortFactory = new SortFactory();
        Printer.printMessage("* ================================ *");
        Printer.printMessage("Unsorted Array:");
        Printer.printArray(unsortedArray);

        Printer.printMessage("\nSorted Array:");
        Printer.printArray(sortFactory.getSorter(sortType).sortArray(unsortedArray));

        Printer.printMessage("* ================================ *");
    }

    public static void binaryTreeDefault(boolean inAscending) {
        int[] unsortedArray = Starter.randomArray(10,1,15);
        BinaryTreeAlgorithm binaryTree = new BinaryTreeAlgorithm();
        Printer.printMessage("* ================================ *");
        Printer.printMessage("Unsorted array:");
        Printer.printArray(unsortedArray);
        binaryTree.addElements(unsortedArray);

        Printer.printMessage("\nSorted array:");
        if (inAscending) {
            Printer.printArray(binaryTree.getSortedTreeAsc());
        } else {
            Printer.printArray(binaryTree.getSortedTreeDesc());
        }

        Printer.printMessage("* ================================ *");
    }

    public static void binaryTreeUser(int[] userArray, boolean inAscending) {
        BinaryTreeAlgorithm binaryTree = new BinaryTreeAlgorithm();
        Printer.printMessage("* ================================ *");
        Printer.printMessage("* Unsorted array:");
        Printer.printArray(userArray);
        binaryTree.addElements(userArray);

        Printer.printMessage("\n* Sorted array:");
        if (inAscending) {
            Printer.printArray(binaryTree.getSortedTreeAsc());
        } else {
            Printer.printArray(binaryTree.getSortedTreeDesc());
        }

        Printer.printMessage("* ================================ *");
    }
}
