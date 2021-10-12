package com.company;


//OVERRIDING
//SAME PARAMETER NAME



public class Dog {

    public void bark(){
        System.out.println("woof");
    }

class GermanShepard extends Dog {

    @Override
    public void bark() {
        System.out.println("woof woof woof");
    }
}
}
