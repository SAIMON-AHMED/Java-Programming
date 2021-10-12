package com.company;

public class Room {

    private int numberOfWalls;
    private String colorOfWalls;
    private int numberOfDoors;
    private String roomSize;


    public Room(int numberOfWalls, String colorOfWalls, int numberOfDoors, String roomSize) {
        this.numberOfWalls = numberOfWalls;
        this.colorOfWalls = colorOfWalls;
        this.numberOfDoors = numberOfDoors;
        this.roomSize = roomSize;
    }

    public void isComfortable(){

        System.out.println("I am comfortable with my room.");

    }

    public int getNumberOfWalls() {
        return numberOfWalls;
    }

    public String getColorOfWalls() {
        return colorOfWalls;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public String getRoomSize() {
        return roomSize;
    }
}
