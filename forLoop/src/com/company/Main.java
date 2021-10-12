package com.company;

public class Main {

    public static void main(String[] args) {

//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000,2));
//        System.out.println("10,000 at 3% interest = " + calculateInterest(10000,3));
//        System.out.println("10,000 at 4% interest = " + calculateInterest(10000,4));
//        System.out.println("10,000 at 5% interest = " + calculateInterest(10000,5));

//          using the for statement, call the calculateInterest method with the amount of
//          10000 with an interestRate 0f 2,3,4,5,6,7 and 8 and print the results to console window.

        for (int i = 2; i <= 8; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));

            /*SOMETHING IMPORTANT TO NOTICE:
            In the above print statement if we don't use "String.format("%.2f",....), it shows us something weird(700.00000000000001)-try it.
            Secondly, if we put "%0.2f", it doesn't work.So,here 0.2 and .2 are different.
            * */


        }
        System.out.println("****************************************");

//            How would you modify the for loop above to do the same thing as shown but to start from 8%
//            and work back to 2%
//
        for (int i = 8; i >1 ; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));


        }
        //Create a for statement using any range of numbers
        //Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out and increment a count of the
        // number of prime numbers found
        //if that count is 3 exit the for loop
        //hint: use the break; statement to exit
        int count = 0;
        for (int i =  0; i < 10; i++){
            if (isPrime(i)){
                System.out.println(i + " is a prime number.");
                count++;
            }
            if (count == 3){
                break;
            }

        }
    }

    public static boolean isPrime(int n){
        if (n == 1 || n == 0){
            return false;

        }
        for (int i = 2; i <= n/2; i++){
            if (n % i == 0){
                return false;
            }
        }

        return true;

    }


    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }
}
