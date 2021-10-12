package com.company;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        //int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
        //myIntArray[5] = 50;

        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i*10;
        }
//        double[] myDoubleArray = new double[10];
//        myDoubleArray[0] = 11;

//        System.out.println("My int array at index 5: " + myIntArray[0]);
//        System.out.println("My int array at index 5: " + myIntArray[1]);
//        System.out.println("My int array at index 5: " + myIntArray[2]);
//        System.out.println("My int array at index 5: " + myIntArray[3]);
//        System.out.println("My int array at index 5: " + myIntArray[4]);
//        System.out.println("My int array at index 5: " + myIntArray[5]);
//
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println("Element " + i + ", value " + myIntArray[i]);
        }
//        System.out.println("My double array at index 0: " + myDoubleArray[0]);
    }
}
