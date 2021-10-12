package com.company;

public class Main {

    public static void main(String[] args) {

	    boolean isAlien = false;
	    if(isAlien == false)
            System.out.println("This is not an alien." );/*what happens here is whether or not we use parenthesis
                                                           we used semi-colon and IntelliJ is taking these two lines
                                                           as one line.*/

	    if(isAlien == true);   /*we have finished our if statement before it works */
            System.out.println("This is not an alien.");/* it is working as a simple statement and it's not
                                                           considered as if statement's part*/

        if(isAlien == false)
            System.out.println("This is not an alien."); /*here if statement ends and the next will print as
                                                           usual*/
            System.out.println("I believe there is out there but only we can know them if Allah wants.");

        if(isAlien == true)
            System.out.println("This is not an alien.");/* if statement ends here and this line doesn't print*/
            System.out.println("I believe there is out there but only we can know them if Allah wants.");//this line will print

        if (isAlien == false){ /*this is a code block and if the conditional logic agrees then the whole statement
                                 in this code block will run*/
            System.out.println("This is not an alien.");
            System.out.println("I believe there is out there but only we can know them if Allah wants.");



            //logical and operator
            int topScore = 100;
            if (topScore == 100) {
                System.out.println("You got the top score!");
            }


            if (topScore != 100) {
                System.out.println("You got the top score!");
            }


            if (topScore > 100) {
                System.out.println("You got the top score!");
            }


            if (topScore < 100) {
                System.out.println("You got the top score!");
            }


            if (topScore >= 100) {
                System.out.println("You got the top score!");
            }

            if (topScore <= 100) {
                System.out.println("You got the top score!");
            }

           int newTopScore = 80;
            if (newTopScore < 100) {
                System.out.println("You got the top score!");
            }

            int secondTopScore = 60;
            if (newTopScore > secondTopScore && (topScore <100)) {
                System.out.println("You got the top score!");
            }
            //TERNARY OPERATOR
            int ageOfClient = 20;
            boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;
            System.out.println("isEighteenOrOver = " + isEighteenOrOver);




        }

    }
}
