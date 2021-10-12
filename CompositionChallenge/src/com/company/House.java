package com.company;

public class House {

    private String houseName;
    private boolean happyHouse;
    private Furniture furniture;
    private SiratRecommended siratRecommended;
    private Dimensions dimensions;
    private Room room;


    public House(String houseName, boolean happyHouse, Furniture furniture,
                 SiratRecommended siratRecommended, Dimensions dimensions, Room room) {
        this.houseName = houseName;
        this.happyHouse = happyHouse;
        this.furniture = furniture;
        this.siratRecommended = siratRecommended;
        this.dimensions = dimensions;
        this.room = room;
    }

    public void love(){
        System.out.println("I love my house.");
    }


    public String getHouseName() {
        return houseName;
    }

    public boolean isHappyHouse() {
        return happyHouse;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public SiratRecommended getSiratRecommended() {
        return siratRecommended;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Room getRoom() {
        return room;
    }
}
