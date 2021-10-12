package com.company;

public class Vehicle {

    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

//    public Vehicle() {
//
//
//
//    }

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;

    }

    public String getName() {

        return name;
    }

    public String getSize() {

        return size;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): direction is " + currentDirection + " degree");
    }

    public void move(int velocity, int direction){
        this.currentVelocity = velocity;
        this.currentDirection = direction;
        System.out.println("Vehicle.move(): velocity is " + currentVelocity + " at the direction of "+
                currentDirection + " degree");
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop(){
        this.currentVelocity = 0;
    }

}
