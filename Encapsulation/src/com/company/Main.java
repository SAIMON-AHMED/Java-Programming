package com.company;

public class Main {

    public static void main(String[] args) {

//THIS PART IS NOT FOR ENCAPSULATION
//        Player player = new Player();
//        player.name = "SaimonSirat";
//        player.health = 20;
//        player.weapon = "love";
//
//        System.out.println("Love " + player.name);
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("SaimonSirat", 50,"dua and love");
        System.out.println("Initial health is " + player.getHitPoints());
        System.out.println(player.getName() + " will fight their battle with " + player.getWeapon());
    }
}
