package com.company;

public class HealthyBurger extends Hamburger {

    private double healthyExtra1Price;
    private String healthyExtra1Name;

    private double healthyExtra2Price;
    private String healthyExtra2Name;

    public HealthyBurger(String meat, double price) {

        super("healthy", meat, price, "brown rye");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();

        if (this.healthyExtra1Name != null) {
            hamburgerPrice += healthyExtra1Price;

        }
        if (this.healthyExtra2Name != null) {
            hamburgerPrice += healthyExtra2Price;

        }
        return hamburgerPrice;
    }
}