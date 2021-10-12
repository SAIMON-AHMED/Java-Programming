package com.company;

import java.util.Locale;

public class Car {

    //creating fields
    // fields = A field is a variable of any type that is declared directly in a class.
    // Fields are members of their containing type.

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("carerra") || validModel.equals("commodore")) {
            this.model = model; // model after this keyword is the field, the second model is the parameter
            // to distinguish two model we used this keyword
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel(){

        return this.model;
    }

}
