package org.sparta.bradleywilliams.starter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.sparta.bradleywilliams.exceptions.ArrayEmptyException;
import org.sparta.bradleywilliams.printer.Printer;
import org.sparta.bradleywilliams.sortingalgorithms.SortTypes;

import java.util.Scanner;

public class Starter {
    private static final Logger logger = LogManager.getLogger(Starter.class);
    private static Scanner sc = new Scanner(System.in);

    public static void start() {
        try {
            Printer.printMessage("***** Welcome to Sort Manager *****\n");
            menuOptions();
            boolean quit = false;
            while (!quit) {
                char input = sc.nextLine().charAt(0);
                if (Character.isDigit(input)) {
                    int option = Character.digit(input,10);
                    if (option >= 1 && option <= 4) {
                        startSortFactory(option);
                        menuOptions();
                    } else if (option == 5) {
                        quit = true;
                    } else {
                        Printer.printMessage("Please enter an option.");
                        menuOptions();
                    }
                } else {
                    menuOptions();
                }
            }
        } catch (ArrayEmptyException e) {
            logger.error("The array is empty!", e);
        } catch (Exception e) {
            logger.fatal("Fatal Exception occurred: ", e);
        }
    }

    public static void startSortFactory(int option) throws ArrayEmptyException {
        switch(option) {
            case 1:
                AlgorithmStarter.sortingAlgorithm(SortTypes.BUBBLE);
                break;
            case 2:
                AlgorithmStarter.sortingAlgorithm(SortTypes.MERGE);
                break;
            case 3:
                AlgorithmStarter.sortingAlgorithm(SortTypes.QUICK);
                break;
            case 4:
                startBinaryTree();
                break;
            default:

                break;
        }
    }

    public static void startBinaryTree() {
        binaryTreeOptions();
        int arrayMethodSelection = sc.nextInt();
        sc.nextLine();
        // Default array used
        if (arrayMethodSelection == 1) {
            sortOrderOptions();
            char ch = sc.nextLine().charAt(0);
            boolean inAscending = Character.toUpperCase(ch) != 'N';
            AlgorithmStarter.binaryTreeDefault(inAscending);
            // User defined array
        } else if (arrayMethodSelection == 2) {
            Printer.printMessage("* ================================ *");
            Printer.printMessage("* Number of elements: *");
            int size = sc.nextInt();
            int[] userArray;
            if (size > 0) {
                userArray = new int[size];
                int i = 0;
                while (i < size) {
                    Printer.printMessage("Enter an integer value to add:");
                    int value = sc.nextInt();
                    sc.nextLine();
                    userArray[i] = value;
                    Printer.printMessage("** " + value + " added **");
                    i++;
                }
                sortOrderOptions();
                char ch = sc.nextLine().charAt(0);
                boolean inAscending = Character.toUpperCase(ch) != 'N';
                AlgorithmStarter.binaryTreeUser(userArray, inAscending);
            }
        } else {
            Printer.printMessage("Please select an option provided.");
            startBinaryTree();
        }
    }

    public static void menuOptions() {
        Printer.printMessage("* ================================ *");
        Printer.printMessage("* \t   Please select an option.    *");
        Printer.printMessage("* \t\t\t\tPress key:         *");
        Printer.printMessage("* \t\t\t1. Bubble Sort         *");
        Printer.printMessage("* \t\t\t2. Merge Sort          *");
        Printer.printMessage("* \t\t\t3. Quick Sort          *");
        Printer.printMessage("* \t\t\t4. Binary Tree         *");
        Printer.printMessage("* \t\t\t5. Quit                *");
        Printer.printMessage("* ================================ *\n");
    }

    public static void binaryTreeOptions() {
        Printer.printMessage("* ================================ *");
        Printer.printMessage("* \t   Please select an option.    *");
        Printer.printMessage("* \t\t\t Press key:            *");
        Printer.printMessage("* 1. Use randomly generated array  *");
        Printer.printMessage("* 2. Create your own array         *");
        Printer.printMessage("* ================================ *\n");
    }

    public static void sortOrderOptions() {
        Printer.printMessage("* ================================ *");
        Printer.printMessage("*  Order array in Ascending order? *");
        Printer.printMessage("* \t   Please select an option.    *");
        Printer.printMessage("* \t\t\t  Press key:           *");
        Printer.printMessage("* \t\t\t\tY or N             *");
        Printer.printMessage("* ================================ *\n");
    }

    public static int[] randomArray(int size, int lowerBound, int upperBound) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * (upperBound-lowerBound + 1) + lowerBound);
        }
        return array;
    }
}
