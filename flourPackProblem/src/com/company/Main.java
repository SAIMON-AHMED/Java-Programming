package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(canPack(2,0,9));//false
        System.out.println(canPack(1,0,4));//false
        System.out.println(canPack(1,0,5));//true
        System.out.println(canPack(0,5,4));//true
        System.out.println(canPack(2,2,11));//true
        System.out.println(canPack(-3,2,12));//false
        System.out.println(canPack(5,3,24));//false
    }


    public static boolean canPack(int bigCount, int smallCount, int goal){


        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        int sum = (bigCount * 5) + smallCount;
        if (sum >= goal) {
            for (int i = bigCount; i >= 0; i--) {
                for (int j = smallCount; j >= 0; j--) {
                    if (goal == ((i * 5) + j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


}
