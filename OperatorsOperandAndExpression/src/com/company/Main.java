package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 3; // 1 + 3 = 4
        System.out.println("1 + 3 = " + result);

        int previousResult = result;
        System.out.println("Previous result is = " + previousResult);

        result = result -1; // 3 - 1 = 2
        System.out.println("New result is = " + result);

        result = result * 7;
        System.out.println("Result after multipied by 2 = " + result);
        System.out.println("Previous result is = " + previousResult);

        result = result / 3;
        System.out.println("New result after dividing it by 3 is " + result);

        result = result % 2; // the remainder of (3 / 2)
        System.out.println("remainder = " + result);


    }
}
