package com.company;

public class Main {

    public static void main(String[] args) {
	    int myMinintValue = Integer.MIN_VALUE;
        System.out.println("Minimum integer value = " + myMinintValue);
        int myMaxintValue = Integer.MAX_VALUE;
        System.out.println("Maximum integer value = " + myMaxintValue);
        System.out.println("Busted minimum integer value = " + (myMinintValue - 1)); //underflow
        System.out.println("Busted maximum integer value = " + (myMinintValue + 1)); //overflow

        int myMaxintTest =  2147483647; // if we replace the last digit which is now 7 by 8, it will show us error
                                        // because we have put a value larger than the maximum value of integer in Java.
        System.out.println(myMaxintTest);
        int myStylishintValue = 2_147_483_647; // we can use underscore and it's not a problem
        System.out.println(myStylishintValue);

        byte myMinbyteValue = Byte.MIN_VALUE;
        System.out.println("Minimum byte value = " + myMinbyteValue);
        byte myMaxbyteValue = Byte.MAX_VALUE;
        System.out.println("Maximum byte value = " + myMaxbyteValue);

        short myMinShortValue = Short.MIN_VALUE;
        System.out.println("Minimum Short value = " + myMinShortValue);
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Maximum short value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("Minimum Long value = " + myMinLongValue);
        Long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Maximum Long value = " + myMaxLongValue);

        long myBigLongLiteralValue = 2147483647; // WHEN WE ARE PUTTING THE HIGHEST VALUE OF INTEGER, IT TAKES IT.
                                                 // BUT IF WE PUT 1 BIGGER THAN THIS NUMBER, WE WILL HAVE A ERROR
                                                 // BECAUSE INTELLIJ IS CONSIDERING THIS NUMBER AS INTERGER TYPE,
                                                 // NOT AS A LONG NUMBER
        System.out.println(myBigLongLiteralValue);
        long myBigLongLiteralNumber = 2147483648L; // WE'VE ADDED L,NOW INTELLIJ WILL TAKE THIS NUMBER AS LONG TYPE
        System.out.println(myBigLongLiteralNumber);


        int myTotal = (myMinintValue / 2);
        System.out.println(myTotal);

        byte myNewByteValue = (byte) (myMinbyteValue / 2);
        System.out.println(myNewByteValue);

        short myNewShortValue = (short) (myMinShortValue / 2);
        System.out.println(myNewShortValue);





    }
}
