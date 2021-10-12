package com.company;

public class Car extends Vehicle{

   private int numberOfTyres;
   private int numberOfDoors;
   private int numberOfSeats;
   private int currentGear;
   private boolean isManual;


   //if we use default constructor in the vehicle method, we wouldn't need the following constructor
   public Car(String name, String size, int numberOfTyres, int numberOfDoors,
              int numberOfSeats, int currentGear, boolean isManual) {
      super(name, size);
      this.numberOfTyres = numberOfTyres;
      this.numberOfDoors = numberOfDoors;
      this.numberOfSeats = numberOfSeats;
      this.currentGear = 1;
      this.isManual = isManual;

   }

   public void changeGear(int currentGear){
      this.currentGear = currentGear;
      System.out.println("Car.changeGear(): Changed to " + this.currentGear + " gear.");
   }

   public void changeVelocity(int speed, int direction){
      System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
      move(speed,direction);
   }

}
