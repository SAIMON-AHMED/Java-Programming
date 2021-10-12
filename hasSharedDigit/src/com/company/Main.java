package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Solution based on if statement =" + hasSharedDigit(9,99));
        System.out.println("Solution based on for loop =" + hasSharedDigit1(9,99));
        System.out.println("Solution based on while loop =" + hasSharedDigit2(9, 99));

    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber){

        if((firstNumber < 10 || firstNumber > 99) || (secondNumber < 10 || secondNumber > 99)){
            return false;
        }

        int lastDigit1 = firstNumber % 10;
        int lastDigit2 = secondNumber % 10;
        int firstDigit1 = firstNumber / 10;
        int firstDigit2 = secondNumber / 10;

        if(firstDigit1 == firstDigit2 || firstDigit1 == lastDigit2 || lastDigit1 == firstDigit2 || lastDigit1 == lastDigit2){
            return true;
        }
        return false;
    }


/*
So it's not necessary to use nested loops since we know the range makes each number only 2 digit long.
But if the exercise was to evaluate shared digits of two numbers with any number of digits (like, 127 vs 3456789),
then the use of nested loops is totally correct.
But to make the code cleaner the use of nested for loops, as oppose to nested while loops, will minimize the extra code/variables needed.
 */

    public static boolean hasSharedDigit1 (int num1, int num2){
        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        for(int i = num1; i > 0; i /= 10) {
            for(int j = num2; j > 0 ; j /= 10) {
                if(i % 10 == j % 10){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasSharedDigit2(int num1, int num2){
        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        int originalNum2 = num2; // hold value of num2
        while (num1 > 0){
            while (num2 > 0){
                if (num1 % 10 == num2 % 10){
                    return true;
                }
                num2 /= 10;
            }
            num1 /= 10;
            //num2 = originalNum2; // reset value of num2 since it became 0
            // I don't need to reset value
        }
        return false;
    }



}
