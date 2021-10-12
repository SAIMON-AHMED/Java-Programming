package com.company;

public class Main {

    public static void main(String[] args) {

        // 1500, 900, 400, 50

        int highScorePosition =  calculateHighScorePosition(1500);
        displayHighScorePosition("Saimon" , highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Saimon", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Saimon", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Saimon", highScorePosition);



    }
    public static void displayHighScorePosition(String nameOfPlayer, int positionOfPlayer ) {
        System.out.println(nameOfPlayer + " managed to get into position " + positionOfPlayer + " on the high score table.");
    }
    public static int calculateHighScorePosition (int scoreOfPlayer ) {
//        if (scoreOfPlayer >= 1000) {
//            return 1;
//        } else if (scoreOfPlayer >= 500) {
//            return 2;
//        }
//        else if (scoreOfPlayer >= 100 ) {
//            return 3;
//        } else {
//            return 4;

        //almost every program has multiple ways to solve it.
        int position = 4;
        if (scoreOfPlayer >= 1000) {
            position = 1;
        } else if (scoreOfPlayer >= 500) {
            position = 2;
        } else if (scoreOfPlayer >= 100) {
            position = 3;
        }
        return position;
    }

 

}
