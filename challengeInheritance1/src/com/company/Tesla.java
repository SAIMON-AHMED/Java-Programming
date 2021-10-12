package com.company;

public class Tesla extends Car{

    private String nameOfTheOwner;
    private String latestModel;
    private int marketPosition;
    private int roadServiceMonths;




    //if we use default constructor in the vehicle method, we wouldn't need the following constructor


    public Tesla(String nameOfTheOwner, String latestModel, int marketPosition, int roadServiceMonths) {
        super("S3", "4WD", 4, 4, 6, 6, false);
        this.nameOfTheOwner = nameOfTheOwner;
        this.latestModel = latestModel;
        this.marketPosition = marketPosition;
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){

        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0){
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20){
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30){
            changeGear(3);
        } else {
            changeGear(4);
        }
        if (newVelocity > 0){
            changeVelocity(newVelocity,getCurrentDirection());
        }
    }



}
