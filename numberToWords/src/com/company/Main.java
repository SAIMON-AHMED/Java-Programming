package com.company;

public class Main {

    public static void main(String[] args) {

        // it made me tired.
        numberToWords(100);


    }
    public static void numberToWords(int number){

        if (number < 0){
            System.out.println("Invalid Value");
        } else {
            int newNumber = number;
            number = reverse(number);
                while (number != 0) {
                    int lastDigit = number % 10;
                    number /= 10;

                    switch (lastDigit) {
                        case 0:
                            System.out.print("Zero");
                            break;

                        case 1:
                            System.out.print("One");
                            break;
                        case 2:
                            System.out.print("Two");
                            break;
                        case 3:
                            System.out.print("Three");
                            break;
                        case 4:
                            System.out.print("Four");
                            break;

                        case 5:
                            System.out.print("Five");
                            break;
                        case 6:
                            System.out.print("Six");
                            break;
                        case 7:
                            System.out.print("Seven");
                            break;
                        case 8:
                            System.out.print("Eight");
                            break;
                        default:
                            System.out.print("Nine");
                    }
                }
            number = newNumber;
            int numberOfZeros = getDigitCount(number) - getDigitCount(reverse(number));
            for (int i = 1; i <= numberOfZeros; i++){
                System.out.print(" Zero");
            }
            }
        }


    public static int reverse(int number){

        int reverse = 0;

        while (number != 0){

            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;

            }
        return reverse;
    }

    public static int getDigitCount(int number){

        if (number < 0){
            return -1;
        }

        int count = 0;

        if (number == 0){
            return 1;
        }

        while (number > 0){

            number /= 10;
            count++;
        }
        return count;
    }
}