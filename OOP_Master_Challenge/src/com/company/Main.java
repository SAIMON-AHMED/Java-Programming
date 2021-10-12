package com.company;

public class Main {

    public static void main(String[] args) {

//        Burger burger = new Burger("Hamburger", "Kaiser roll","meat");
//        System.out.println(burger.price("Kaiser roll", "meat", 2,3,3,3));

        Delux delux = new Delux(4,5);
        System.out.println(delux.price("Kaiser roll","meat",1,1,1,1));

    }
}

class Burger {

    private String name;
    private String breadRoll;
    private String meat;
    private int lettuce;
    private int tomato;
    private int carrot;
    private int onion;
    private int price;

    public Burger(String name, String breadRoll, String meat) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = 20;

        this.lettuce = 1;
        this.tomato = 1;
        this.carrot = 1;
        this.onion = 1;

    }

    public int price(String breadRoll,String meat, int lettuce, int tomato, int carrot, int onion) {

        if ((lettuce >= 4 || tomato >= 4 || carrot >= 4 || onion >= 4) && !getMeat().equals("meat")) {
            return -1;
        }

        if (this.breadRoll.equals("Sliced bread") || this.breadRoll.equals("Kaiser roll")) {
            this.price = this.price + (lettuce - 1) * 2 + (tomato - 1) * 2 + (carrot - 1) * 2 + (onion -1) * 2;
        }
        return this.price;
    }
    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public int getLettuce() {
        return lettuce;
    }

    public int getTomato() {
        return tomato;
    }

    public int getCarrot() {
        return carrot;
    }

    public int getOnion() {
        return onion;
    }
}

class HealthyBurger extends Burger {

    private boolean healthy;
    private int suger;


    public HealthyBurger(String name, String breadRoll, String meat, boolean healthy, int suger) {
        super(name, breadRoll, meat);
        this.healthy = healthy;
        this.suger = suger;
    }

    public boolean isHealthy(String healthy){
        if (healthy.equals("healthy")){
            return true;
        } else {
            return false;
        }
    }

    public void sugerLevel(int suger){
        if (suger > 5) {
            System.out.println("Decrease suger level");
        } else {
            System.out.println("Suger level is ok");
        }
    }

    @Override
    public int price(String breadRoll, String meat, int lettuce, int tomato, int carrot, int onion) {
        return super.price(breadRoll, meat, lettuce, tomato, carrot, onion);
    }

    @Override
    public String getBreadRoll() {
        return super.getBreadRoll();
    }

    @Override
    public String getMeat() {
        return super.getMeat();
    }

    @Override
    public int getLettuce() {
        return super.getLettuce();
    }

    @Override
    public int getTomato() {
        return super.getTomato();
    }

    @Override
    public int getCarrot() {
        return super.getCarrot();
    }

    @Override
    public int getOnion() {
        return super.getOnion();
    }
}

class Delux extends Burger {

    private int chips;
    private int drinks;

    public Delux(int chips, int drinks) {
        super("Delux","Kaiser roll","meat");
        this.chips = chips;
        this.drinks = drinks;
    }

    @Override
    public int price(String breadRoll, String meat, int lettuce, int tomato, int carrot, int onion) {
        return super.price(breadRoll, meat, lettuce, tomato, carrot, onion) + chips * 3 + (drinks * 5);
    }
}
// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class
// (in other words new burger type).
// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.
//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additional, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.