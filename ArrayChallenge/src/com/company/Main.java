package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        int number = scanner.nextInt();
        int[] myIntegers = getIntegers(number);

        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", value was typed: " + myIntegers[i]);
        }
        printArray(sortIntegers(myIntegers));
    }
    public static int[] getIntegers(int number) {
        int[] values = new int[number];
        System.out.println("Enter " + number + " integer values.");
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static int[] sortIntegers(int[] values) {
        int[] sortedArray = new int[values.length];
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = values[i];
        }

        int a;
        boolean flag = true;
        while (flag) {

            flag = false;
            for (int i = 0; i < values.length - 1; i++) {
                if (values[i] < values[i + 1]) {
                    a = values[i];
                    values[i] = values[i + 1];
                    values[i + 1] = a;
                    flag = true;
                }
            }
        }
        return (values);
    }
    public static void printArray(int[] values) {

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
}
// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.