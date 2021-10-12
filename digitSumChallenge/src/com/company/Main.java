package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumDigits(127));

    }

    public static int sumDigits(int number) {

        if (number < 10){
            return -1;
        }

        int sum = 0;
        while (number >= 10){

            int lastDigit = number % 10;
            sum += lastDigit;
            int extractingLastDigit = number / 10;
            number = extractingLastDigit;

            if (number < 10){
                sum += number;
            }

        }
        return sum;
    }

        /*Instructor's code:

        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {

            int digit = number % 10;
            sum += digit;

            number /= 10;
        }
        return sum;

    }

    */
}