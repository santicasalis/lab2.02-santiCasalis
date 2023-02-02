package org.example.classes;

public class Player {
    private int health;
    private int lives;
    private int strength;

    private final  int maxHealth =100;

    public Player(int health, int lives, int strength){
        this.health = health;
        this.lives = lives;
        this.strength = strength;
    }

    public int decrement(){
        if(health <=0){
            lives--;
            health= maxHealth;
        }return health;
    }


    public int getHealth() {
        return health;
    }

    public int setHealth(int health) {
        this.health = health;
        return health;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


    public void attack(Player playerAttack){
        playerAttack.setHealth(playerAttack.getHealth() - this.getStrength());
    }
}
