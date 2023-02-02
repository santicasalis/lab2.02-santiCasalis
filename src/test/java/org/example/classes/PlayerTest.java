package org.example.classes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
private Player player1;
private Player player2;

    @BeforeEach
     void setUp() {
        player1 = new Elf(100, 2,100,50);
        player2= new Warrior(100, 2, 100, 80);
    }

    @AfterEach

    void tearDown() {

    }

    @Test
    void decrement_health_down() {
        assertEquals(100, player1.decrement());
    }

    @Test
    void health_attack_down() {
        assertEquals(0, player1.setHealth(player1.getHealth()-player2.getStrength()));
    }

}