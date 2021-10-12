package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        System.out.print("Enter a count number: ");
//        Scanner scanner = new Scanner(System.in);
//        int count = scanner.nextInt();
//        scanner.nextLine();
        //System.out.println(Arrays.toString(readElements(readInteger())));
        System.out.println("The minimum value is " + findMin(readElements(readInteger())));

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

    private static int findMin(int[] array) {
        boolean flag = true;
        int temp ;

        while (flag) {
            flag = false;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag = true;
                }
            }
        }
        return array[0];
    }
}

/*
-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.

        -The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.

        -Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.

        -In the main() method read the count from the console and call the method readIntegers() with the count parameter.

        -Then call the findMin() method passing the array returned from the call to the readIntegers() method.

        -Finally, print the minimum element in the array.

        Tips:
        -Assume that the user will only enter numbers, never letters
        -For simplicity, create a Scanner as a static field to help with data input
        -Create a new console project with the name eMinElementChallengef
*/