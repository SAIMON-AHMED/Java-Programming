package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int number;
        String wrongInput; // to show what was wrong that user entered.
        boolean validation;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");


        validation = keyboard.hasNextInt(); // user enters data here.

        if (validation) {
            number = keyboard.nextInt(); // if validation = true, pass to here.
            System.out.println("You entered: " + number);
/* THE DIFFERENCE BETWEEN hasNextInt() and nextInt() :
hasNextInt () - This function reads the input given and checks whether it is an integer type input or not,
                then it returns the output as true or false accordingly. Its return type is a boolean value.

nextInt () - This function reads the input given and returns the same value as the output
             (but if the input type is not an integer then it raises an error). Its return type is an integer value

-The hasNextInt() is used to check if there are any more elements left and the nextInt() is used to access that element.
 */

        } else {
            wrongInput = keyboard.nextLine();
            System.out.println(wrongInput + " is not a number"); // if validation != true, pass to here.
        }
        keyboard.close();
    }

    /*What I have understood is that when line 17 is executed, line 14 asks for an input from the console. So your input was 98.
    There is something like a buffer, imagine an empty box where every input goes, each after each. So when you type 98,
    98 will go in the buffer and will stay there.  keyboard.hasNextInt(); on line 17 will scan the buffer and comes across the 98.
    It returns true, because 98 is an integer value. THE 98 WILL STILL STAY IN THE BUFFER until line 20: number = keyboard.nextInt();
    is executed. This line will take the 98 from the buffer and assign it to number. What is remaining in the buffer,
    is the next line character (enter character).
    To completely empty the buffer, you have to use keyboard.nextLine();
     */

}
