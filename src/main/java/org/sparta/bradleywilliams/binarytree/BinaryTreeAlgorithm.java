package org.sparta.bradleywilliams.binarytree;

import org.sparta.bradleywilliams.exceptions.ChildNotFoundException;
import org.sparta.bradleywilliams.interfaces.BinaryTree;
import org.sparta.bradleywilliams.printer.Printer;

import java.util.ArrayList;

public class BinaryTreeAlgorithm implements BinaryTree {
    static class Node {
        int data;
        Node leftNode;
        Node rightNode;

        Node(int value) {
            data = value;
            rightNode = null;
            leftNode = null;
        }
    }

    private Node root;
    private int size = 0;

    @Override
    public int getRootElement() {
        return this.root.data;
    }

    @Override
    public int getNumberOfElements() {
        return size;
    }

    @Override
    public void addElement(int element) {
        Node node = new Node(element);
        if (root == null) {
            root = node;
            Printer.printMessage(root.data + " is the root node");
            size++;
        } else {
            addNode(element);
            size++;
        }
    }

    @Override
    public void addElements(int[] elements) {
        for (int element : elements) {
            addElement(element);
        }
    }

    @Override
    public boolean findElement(int value) {
        Node[] nodes = arrayInOrder();
        for (Node node : nodes) {
            if (node.data == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        if (!findElement(element)) {
            throw new ChildNotFoundException(element + " is not inside the tree");
        }

        Node[] nodes = arrayInOrder();
        for (Node node : nodes) {
            if (node.data == element) {
                return node.leftNode.data;
            }
        }
        return -1;
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        if (!findElement(element)) {
            throw new ChildNotFoundException(element + " is not inside the tree");
        }

        Node[] nodes = arrayInOrder();
        for (Node node : nodes) {
            if (node.data == element) {
                return node.rightNode.data;
            }
        }
        return -1;
    }

    @Override
    public int[] getSortedTreeAsc() {
        return printTree();
    }

    @Override
    public int[] getSortedTreeDesc() {
        int[] original = getSortedTreeAsc();
        int[] reversed = new int[size];
        for (int i = 0; i < size; i++) {
            reversed[size-1-i] = original[i];
        }
        return reversed;
    }

    public void addNode(int element) {
        Node current = root;
        boolean placed = false;
        while (!placed) {
            if (element >= current.data) {
                if (current.rightNode == null) {
                    current.rightNode = new Node(element);
                    Printer.printMessage(element + " has been inserted to the right of " + current.data);
                    placed = true;
                } else {
                    current = current.rightNode;
                }
            } else {
                if (current.leftNode == null) {
                    current.leftNode = new Node(element);
                    Printer.printMessage(element + " has been inserted to the left of " + current.data);
                    placed = true;
                } else {
                    current = current.leftNode;
                }
            }
        }
    }

    public Node[] arrayInOrder() {
        ArrayList<Node> nodes = new ArrayList<>();
        Node[] elements = new Node[size];
        Node current = root;

        int i = 0;
        while (!nodes.isEmpty() || current != null) {
            if (current != null) {
                nodes.add(current);
                current = current.leftNode;
            } else {
                Node node = nodes.remove(nodes.size()-1);
                elements[i++] = node;
                current = node.rightNode;
            }
        }
        return elements;
    }

    public int[] printTree() {
        Node[] nodes = arrayInOrder();
        int[] elements = new int[size];
        for (int i = 0; i < nodes.length; i++) {
            elements[i] = nodes[i].data;
        }
        return elements;
    }
}
