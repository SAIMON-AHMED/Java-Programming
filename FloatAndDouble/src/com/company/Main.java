package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        System.out.println("minimum float value = " + myMinFloatValue);
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("maximum float value = " + myMaxFloatValue);
        double myMinDoubleValue = Double.MIN_VALUE;
        System.out.println("minimum double value = " + myMinDoubleValue);
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("maximum double value = " + myMaxDoubleValue);

        int myIntValue = 5;
        System.out.println(myIntValue);
        float myFloatValue = (float)5;//5f is also valid
        System.out.println(myFloatValue);
        double myDoubleValue = 5D;
        System.out.println(myDoubleValue);
    }
}
