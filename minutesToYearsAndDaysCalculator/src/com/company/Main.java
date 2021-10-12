package com.company;

public class Main {

    public static void main(String[] args) {

       printYearsAndDays(525600);

        printYearsAndDays(1440);


    }

    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        } else {
            long years = minutes / (24*60*365);
            long days = (minutes % (24*60*365)) / (24 * 60);
            //long remainingMinutes = (minutes % (24*60*365)) % (24 * 60);
            System.out.println(minutes + " min = " + years + "y and " + days + " d" );
        }
    }

}
