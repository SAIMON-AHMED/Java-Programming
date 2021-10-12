package com.company;

public class Furniture {

    private int numberOfChairs;
    private int numberOfBed;
    private String furnitureBrand;
    private String furnitureColor;


    public Furniture(int numberOfChairs, int numberOfBed, String furnitureBrand, String furnitureColor) {
        this.numberOfChairs = numberOfChairs;
        this.numberOfBed = numberOfBed;
        this.furnitureBrand = furnitureBrand;
        this.furnitureColor = furnitureColor;
    }


    public void isBeautiful(){

        System.out.println("The decoration of the room is beautiful.");

    }


    public int getNumberOfChairs() {
        return numberOfChairs;
    }

    public int getNumberOfBed() {
        return numberOfBed;
    }

    public String getFurnitureBrand() {
        return furnitureBrand;
    }

    public String getFurnitureColor() {
        return furnitureColor;
    }
}
