package org.example.classes;
import org.example.classes.Player;
public class Warrior extends Player{
    private int war;

    public Warrior(int health, int lives, int strength, int war) {
        super(health, lives, strength);
        this.war =war;
    }

    public int getWar() {
        return war;
    }
    public void setWar(int war) {
        this.war = war;
    }
}
