package com.company;

//THIS IS NOT AN EXAMPLE OF ENCAPSULATION

public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){

        this.health = this.health - damage;
        if (health <= 0){
            System.out.println("Player kicked out");
            //reduce number of lives remaining for the player
        }
    }

    public int healthRemaining(){
        return this.health;
    }


}
