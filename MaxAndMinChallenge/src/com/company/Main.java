package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        /*-Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
-Before the user enters the number, print the message gEnter number:h
-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.

Hint:
-Use an endless while loop.

Bonus:
-Create a project with the name MinAndMaxInputChallenge.*/

        Scanner scanner = new Scanner(System.in);

        //        boolean isAnInt = scanner.hasNextInt();
//        if we put the above line here instead of below the while loop, we will get an inputmismatcherror when we will
        // enter a non-int value because in this case program will keep the value false from hasNextInt() and it will crash with
        // the true in while loop
//        int max = 0;
//        int min = 0;
//        boolean firstNumber = true;

        // without flag
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // ekhon j number amre input dei na keno seta min = 2147483647, ei value-er chaite chuto hote hobe
        // ebong max value  max = - 2147483648-er chaite boro hote hobe

        while (true){

            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
//                if (firstNumber) {
//                    firstNumber = false;
//                    min = number;
//                    max = number;
//                }
                max = Math.max(max, number);
                min = Math.min(min, number);
            } else {
                scanner.nextLine();
                System.out.println("MAXIMUM = " + max);
                System.out.println("MINIMUM = " + min);
                break;
            }
        }
        scanner.close();
    }
}
