package com.company;

public class Main {

    public static void main(String[] args) {

        double value1 = 20.00d;
        double value2 = 80.00d;
        double sum = (value1 + value2) * 100.00d;
        System.out.println(sum);
        double remainder = sum % 40.00;
        System.out.println(remainder);

        /*if ( remainder == 0) {
            boolean resultOfRemainder = true;
            System.out.println(resultOfRemainder);

        } else {
            boolean resultOfRemainder = false;
            System.out.println(resultOfRemainder);


        }*/
        boolean isNoRemainder = (remainder == 0 ) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder){
            System.out.println("Got some remainder.");
        }

    }
}
