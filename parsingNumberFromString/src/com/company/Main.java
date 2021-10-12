package com.company;

public class Main {

    public static void main(String[] args) {

        String numberToString = "2015";
        System.out.println("numberToString = " + numberToString);

        int number = Integer.parseInt(numberToString);
        System.out.println("number = " + number);

        numberToString += 1;
        number += 1;

        System.out.println("NumberToString = " + numberToString);
        System.out.println("Number = " + number);


        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println("===============================");

        numberToString = "2015.10";
        System.out.println("numberToString = " + numberToString);

        double DoubleNumber = Double.parseDouble(numberToString);
        System.out.println("number = " + DoubleNumber);

        numberToString += 1;
        DoubleNumber += 1;

        System.out.println("NumberToString = " + numberToString);
        System.out.println("Number = " + DoubleNumber);


    }
}
