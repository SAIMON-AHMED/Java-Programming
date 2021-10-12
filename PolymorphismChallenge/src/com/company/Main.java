package com.company;



public class Main {

    public static void main(String[] args) {

        Outlander outlander = new Outlander();
        System.out.println("Number of cylinders in Outlander " + outlander.getCylinders());
        outlander.brake(80);//use of getClass.getSimpleName()

        Elantra elantra = new Elantra();
        System.out.println(elantra.startEngine());

        S3 s3 = new S3();
        System.out.println("Elon Musk's company and the model name is " + s3.getName());

    }
}

class Car{

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean startEngine(){
        if (engine){
            System.out.println("Engine is started");
        } else {
            System.out.println("Engine needs to start");
        }
        return true;
    }

    public void accelerate(int speed){
        System.out.println("Car in " + speed + " speed");
    }

    public void brake(int speed){
        if (speed > 100){
            System.out.println("Brake now!");
        } else{
            System.out.println("Brake when you need");
        }
    }
}

class Elantra extends Car {

    public Elantra() {
        super("Elantra", 4);
    }

    @Override
    public void accelerate(int speed) {
        super.accelerate(speed);
    }

    @Override
    public boolean startEngine() {
        super.startEngine();
        return true;
    }


}
class Outlander extends Car{

    public Outlander(){
        super("Outlander",6);
    }

    @Override
    public void brake(int speed) {

        super.brake(speed);
        System.out.println(getClass().getSimpleName());
    }
}

class S3 extends Car{
    public S3(){
        super("S3",3);
    }

    @Override
    public boolean startEngine() {
        super.startEngine();
        return true;
    }

    @Override
    public void brake(int speed) {
        super.brake(speed);
    }
}
// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generic car class.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).