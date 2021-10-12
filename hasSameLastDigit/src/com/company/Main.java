package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));


    }
//
//    Write a method named hasSameLastDigit with three parameters of type int.
//
//    Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range,
//    the method should return false.
//
//    The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.


    public static boolean hasSameLastDigit(int a, int b, int c){

//        if ((a >= 10 && a <= 1000) && (b >= 10 && b <= 1000) && (c >= 10 && c <= 1000)){
        if (isValid(a) && isValid(b) && isValid(c)){
            return ((a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10));
        }
        return false;
    }
    public static boolean isValid(int number){
        return (number >= 10 && number <= 1000);
    }


}
