package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(findMin(readElements(readInteger())));

    }
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        return count;
    }
    private static int[] readElements(int count) {
        int[] array = new int[count];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            int number = scanner.nextInt();
            array[i] = number;
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}