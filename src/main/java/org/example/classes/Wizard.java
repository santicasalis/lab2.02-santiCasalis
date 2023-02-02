package org.example.classes;

public class Wizard extends Player{
    private int magic;

    public int getMagic() {
        return magic;
    }


    public Wizard(int health, int lives, int strength, int magic) {
        super(health, lives, strength);
        this.magic=magic;
    }
    public void setMagic(int magic) {
        this.magic = magic;
    }

}
