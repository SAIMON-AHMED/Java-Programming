package com.company;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void setHealthyExtra1Name(String healthyExtra1Name) {
        this.healthyExtra1Name = healthyExtra1Name;
    }

    public void setHealthyExtra1Price(double healthyExtra1Price) {
        this.healthyExtra1Price = healthyExtra1Price;
    }

    public void setHealthyExtra2Name(String healthyExtra2Name) {
        this.healthyExtra2Name = healthyExtra2Name;
    }

    public void setHealthyExtra2Price(double healthyExtra2Price) {
        this.healthyExtra2Price = healthyExtra2Price;
    }


    @Override
    public double itemizeHamburger() {
       double hamburgerPrice = super.itemizeHamburger();

       if (healthyExtra1Name != null){
           hamburgerPrice += healthyExtra1Price;
           System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
       }

        if (healthyExtra2Name != null){
            hamburgerPrice += healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }
        return hamburgerPrice;
    }
}
