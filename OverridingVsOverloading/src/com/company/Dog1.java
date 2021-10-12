package com.company;


//OVERLOADING
//DIFFERENT PARAMETER NAME


public class Dog1 {

    public void birk(){
        System.out.println("woof");
    }

    public void birk(int number){
        for (int i = 1; i < number; i++){
            System.out.println("woof");
        }
    }

}
