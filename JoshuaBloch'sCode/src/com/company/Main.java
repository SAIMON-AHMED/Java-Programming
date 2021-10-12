package com.company;

import java.util.SplittableRandom;

public class Main {

    private static int[] o = new SplittableRandom().ints().
            limit(100).parallel().filter(i -> (i & 1) == 1).toArray();

    public static void main(String[] args) {

        System.out.println(o.length);

    }
}
