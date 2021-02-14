package org.sparta.bradleywilliams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.sparta.bradleywilliams.binarytree.BinaryTreeAlgorithm;
import org.sparta.bradleywilliams.exceptions.ChildNotFoundException;

public class BinaryTreeTests {
    private final int[] emptyArray = {};
    private final int[] sortedArray = {4,8,10,12,13,15};
    private final int[] unsortedArray = {12,15,8,4,10,13};

    @Test
    @DisplayName("Testing correct output - Binary tree in ASC")
    public void testBinaryTreeASC() {
        BinaryTreeAlgorithm binaryTree = new BinaryTreeAlgorithm();
        binaryTree.addElements(unsortedArray);
        Assertions.assertArrayEquals(sortedArray, binaryTree.getSortedTreeAsc());
    }

    @Test
    @DisplayName("Testing correct output - Binary tree in DSC")
    public void testBinaryTreeDSC() {
        BinaryTreeAlgorithm binaryTree = new BinaryTreeAlgorithm();
        binaryTree.addElements(unsortedArray);
        int[] reversedSorted = {15,13,12,10,8,4};
        Assertions.assertArrayEquals(reversedSorted,binaryTree.getSortedTreeDesc());
    }

    @Test
    @DisplayName("Testing child not found exception - Binary tree")
    public void testChildFoundException() {
        BinaryTreeAlgorithm binaryTree = new BinaryTreeAlgorithm();
        binaryTree.addElements(unsortedArray);
        Assertions.assertThrows(ChildNotFoundException.class, () -> binaryTree.getLeftChild(1));
    }

    @Test
    @DisplayName("Testing an empty array")
    public void testEmptyArrayBinary() {
        BinaryTreeAlgorithm binaryTree = new BinaryTreeAlgorithm();
        binaryTree.addElements(emptyArray);
        Assertions.assertArrayEquals(emptyArray, binaryTree.getSortedTreeAsc());
    }

    @Test
    @DisplayName("Testing adding a new element")
    public void testAddElement() {
        BinaryTreeAlgorithm binaryTree = new BinaryTreeAlgorithm();
        binaryTree.addElements(unsortedArray);
        binaryTree.addElement(1);
        Assertions.assertTrue(binaryTree.findElement(1));
    }

    @Test
    @DisplayName("Testing retrieving the root element")
    public void testRootRetrieval() {
        BinaryTreeAlgorithm binaryTree = new BinaryTreeAlgorithm();
        binaryTree.addElements(unsortedArray);
        Assertions.assertEquals(12, binaryTree.getRootElement());
    }

    @Test
    @DisplayName("Testing get size of the binary tree")
    public void testGetSize() {
        BinaryTreeAlgorithm binaryTree = new BinaryTreeAlgorithm();
        binaryTree.addElements(unsortedArray);
        Assertions.assertEquals(unsortedArray.length, binaryTree.getNumberOfElements());
    }

}
