package com.company;

public class Main {

    public static void main(String[] args) {

/*
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
*/
        int levelCompleted = 5;
        int bonus = 100;


//        if (gameOver) {
//            int finalScore = score + ( levelCompleted * bonus);
//            finalScore += 1000;
//            System.out.println("Your final score was " + finalScore);
//        }
//
//
//        gameOver = true;
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;

 /*
        if (gameOver) {
            int finalScore = score + ( levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
 */

        // we are using our method which we've created below
        newCalculateScore(true, 800, levelCompleted, bonus); //we are using parameters in mixed way
        newCalculateScore(false, 10000, 8, 200); // we are using just the parameter's value

        } /* we are doing exactly the same thing but we are doing it by repeating our codes. if we use method, we don't need
        to repeat our works. we just need to define a method and to set some properties that we want our method to have. */

    //define method here.

//    public static void calculateScore(){
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 1000;
//            System.out.println("Your finalScore was " + finalScore);
//        }
//    }
//
    //we can define this method more elegantly
    //public static void newCalculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    //let's return something
    public static int newCalculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your score was " + finalScore);
            return finalScore;
        }
        return -1; // we have to return something when the method is defined in a way that it will return something
                   // if the if condition is wrong then this method will return -1 and which is necessary otherwise we
                   // will have an error

    }


}
 /* I have written the whole first and commented out them later when I have used method and I kept the previous rest of the code in comment section
 * to compare them with method.*/