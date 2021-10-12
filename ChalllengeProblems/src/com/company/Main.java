package com.company;

public class Main {

    public static void main(String[] args) {

        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;
        boolean gameOver = true;


        if (score == 5000) {
            System.out.println("Your score was 5000.");

        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("FINAL SCORE = " + finalScore);
        }


        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if (gameOver) {
            int newFinalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("New final score is " + newFinalScore);
        }
    }
}
