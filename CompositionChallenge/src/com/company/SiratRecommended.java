package com.company;

public class SiratRecommended {

    private String roomColor;
    private int numberOfDoors;
    private boolean keepFlower;


    public SiratRecommended(String roomColor, int numberOfDoors, boolean keepFlower) {
        this.roomColor = roomColor;
        this.numberOfDoors = numberOfDoors;
        this.keepFlower = keepFlower;
    }

    public boolean doesSiratRecommend(String roomColor, int numberOfDoors, boolean keepFlower){

        if (roomColor.equals("White") && numberOfDoors == 2 && keepFlower){
            System.out.println("Sirat recommended.");
            return true;
        }
        return false;
    }

    public String getRoomColor() {
        return roomColor;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public boolean isKeepFlower() {
        return keepFlower;
    }
}
