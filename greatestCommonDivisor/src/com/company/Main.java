package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(12,30));

    }
    /*
    Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.

If one of the parameters is < 10, the method should return -1 to indicate an invalid value.

The method should return the greatest common divisor of the two numbers (int).

The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).


For example 12 and 30:

12 can be divided by 1, 2, 3, 4, 6, 12

30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30

     */

    public static int getGreatestCommonDivisor(int a, int b){

        if (a < 10 || b < 10){
            return -1;
        }

        int greatestCommonDivisor = 0;
        for (int i = 2; i <= Math.min(a, b); i++){
            if ((a % i == 0) && (b % i == 0) && (greatestCommonDivisor < i)){
                greatestCommonDivisor = i;
            }
        }
        return greatestCommonDivisor;

    }

}
