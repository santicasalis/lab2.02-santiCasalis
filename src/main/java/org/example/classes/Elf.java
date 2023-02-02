package org.example.classes;

public class Elf extends Player {
private int elfSpec;



    public Elf(int health, int lives, int strength, int elfSpec) {
        super(health, lives, strength);
        this.elfSpec=elfSpec;
    }
    public int getElfSpec() {
        return elfSpec;
    }

    public void setElfSpec(int elfSpec) {
        this.elfSpec = elfSpec;
    }
}
