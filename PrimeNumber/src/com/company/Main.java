package com.company;

public class Main {

    public static void main(String[] args) {

        primeNumber(15);
      //  primeNumber(11);
        //primeNumber(7);
    }

    public static void primeNumber(int number){

        if (number <= 1){
            System.out.println("This is not a prime.");
        }

        for (int i = 2; i <= number/2; i++){

            if (number % i == 0){

                System.out.println("This is not a prime.");
                break;

            }

        }
    }

}
