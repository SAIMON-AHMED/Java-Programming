package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));


    }


        public static int getLargestPrime(int number) {

            // if (number <= 0) {
            if (number <= 1) { // 1 is not a prime
                return -1;
            }
            // int largestValue = 0; // not needed
            int largestPrimeValue = 0;
            boolean isPrime = true; // add this flag to determine prime
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {

                    // for (int j = 2; j < i / 2; j++) {
                    for (int j = 2; j < i; j++) {
                        if ((i % j == 0)) {
                            isPrime = false; // if it's divisible further, it's not a prime
                            // if ((i > largestValue)) {
                            //     int value = i;
                            //     break;
                            // }
                        }

                        // largestPrimeValue = i;
                    }
                    if (isPrime) { // added this code block
                        largestPrimeValue = i;
                    }
                }
            }
            return largestPrimeValue;
        }
    }


