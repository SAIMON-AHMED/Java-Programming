package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

/*
Write a method called inputThenPrintSumAndAverage that does not have any parameters.

The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.

When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".

XX represents the sum of all entered numbers of type int.
YY represents the calculated average of all numbers of type long.
 */

    }

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        long avg = 0;

        while (true){
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                count++;
                sum += number;
            } else {
                break;
            }
        }
        if (count > 0) {
           avg =(long) (Math.ceil(Math.round((double) sum / (double) count)));

        }
        System.out.println("SUM = " + sum + " AVG = " + avg);//"SUM = XX AVG = YY".

        scanner.close();

    }

}
