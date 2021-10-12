package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(addition(1,2));
        System.out.println(division(2,0));



    }

    public static double addition(double number1, double number2) {
        return number1 + number2;
    }

    public static double subtraction(double number1, double number2) {
        return number1 - number2;
    }

    public static double multiplication(double number1, double number2) {
        return number1 * number2;
    }

    public static double division(double number1, double number2) {
        double number = -1;
        if (number2 != 0) {
            number = number1 / number2;
        }
        return number;
    }
}
