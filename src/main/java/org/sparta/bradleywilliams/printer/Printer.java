package org.sparta.bradleywilliams.printer;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Printer {
    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printArray(int[] array) {
        Printer.printMessage("* ================================ *");
        System.out.println("* "+ Arrays.toString(array) + " *");
        Printer.printMessage("* ================================ *\n");
    }

    public static void printTimeComplexity(long time) {
        System.out.println(TimeUnit.NANOSECONDS.toMicros(time) + " microseconds");
    }
}
