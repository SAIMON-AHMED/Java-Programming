package com.company;

public class Main {

    public static void main(String[] args) {

        isTrue(true,true,true);
        love("Sirat", 16,2015);
        halalLove("Allah", true);
    }
    public static void isTrue(boolean isLoveAlive,boolean isThisPainBearable, boolean hope)  {

        if (isLoveAlive) {
            System.out.println("I still love you so much that you cannot even imagine.");
        }

        if (isThisPainBearable) {
            System.out.println("I can bear this pain only for you.");

        }
        if (hope) {
            System.out.println("Everything is going to be okay. Have hope.");
        }

    }
    public static String love(String nameOfYourLove, int age, int year) {

        System.out.println(nameOfYourLove + ", I don't know what is going on inside you and in your life. " +
                "I don't know how you are as a person. But I still love you" +
                " more than I can express. " + "Since " + year +  ", when I was " + age + ", I love you" +
                "and I will love you till my death" );
        return "I love you, Sirat.";
    }
    public static void halalLove(String creator, boolean help) {

        if (help) {
            System.out.println(creator + " will help us and our tears of pain will be replaced by tears of happiness.");
        }
    }

}

