package com.company;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {

        super("Deluxe","sausage",14.54,"brown rye");
        super.addHamburgerAddition1("chips",2.75);
        super.addHamburgerAddition2("drinks",1.81);
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Should not add anything");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("Should not add anything");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Should not add anything");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Should not add anything");
    }
}
/*
For the second class, DeluxeBurger, there are no additional member variables, and the constructor
accepts no parameters. Instead, the constructor creates a deluxe burger with all the fixings and
chips and a drink for a base price of $19.10. The constructor can be configured in any way, as long as
 chips and drink are added for the total price just mentioned. In this class, the four(4) methods
 defined in the Hamburger class for including additional toppings must each be overridden so that a
 message is printed stating that no additional items can be added to a deluxe burger.

 */