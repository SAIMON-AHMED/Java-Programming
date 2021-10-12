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

        //abbreviation starts from here

        // result = result +1
        result++; //1 + 1 = 2
        System.out.println("Result after abbreviating the plus operator = " + result);

        //result = result -1
        result--; // result = result -1
        System.out.println("Result after abbreviating the minus operator = " + result);

        // result = result +2
        result += 2;
        System.out.println("Result after abbreviating the plus operator for 2 = " + result);

        // result = result * 10
        result *= 10;
        System.out.println("Result after abbreviating the multiplication by 10 = " + result);

        //result = result / 3
        result /= 10;
        System.out.println("30 / 10 = " + result);

        // resutl = result -2
        result -= 2;
        System.out.println("3 - 2 = " + result);


    }
}
