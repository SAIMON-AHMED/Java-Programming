package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println(isPalindrome(-222));


    }

   public static boolean isPalindrome(int number){

        number = Math.abs(number);

        int reverse = 0;
        int initialNumber = number;

        while (number > 0){

            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;

        }
       System.out.println("reverse = " + reverse);
       return initialNumber == reverse;

   }
}
