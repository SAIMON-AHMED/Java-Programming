package com.company;

public class Main {

    public static void main(String[] args) {
        byte myChallengeByteValue = 54;
        System.out.println(myChallengeByteValue);

        short myChallengeShortValue = 543;
        System.out.println(myChallengeShortValue);

        int myChallengeIntValue = 145;
        System.out.println(myChallengeIntValue);

        long myChallengeLongValue = (50000L + 10L * (myChallengeByteValue + myChallengeIntValue + myChallengeShortValue));
        System.out.println((myChallengeLongValue));

    }
}
