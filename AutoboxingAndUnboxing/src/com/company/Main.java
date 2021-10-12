package com.company;

import java.util.ArrayList;

class intClass {

    private int myValue;

    public intClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {

        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("SaimoSirat");

        ArrayList<intClass> intClassArrayList = new ArrayList<intClass>();
        intClassArrayList.add(new intClass(54));
        Integer integer = new Integer(54);

        Double doubleValue = new Double(56.65);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(Integer.valueOf(i));//AUTOBOXING
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " --> " + integerArrayList.get(i).intValue());//UNBOXING
        }

        Integer myIntValue = 56;//Integer.valueOf(56);
        int myInt = myIntValue;//myIntValue.intValue()

        ArrayList<Double> myDoubleValue = new ArrayList<Double>();
        for (double d = 0.0; d <= 10.0; d += 0.5) {
            myDoubleValue.add(Double.valueOf(d));
        }
        for (int i = 0; i < myDoubleValue.size(); i++) {
            System.out.println(i + " --> " + myDoubleValue.get(i).doubleValue());
        }
    }










}
