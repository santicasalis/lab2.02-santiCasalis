package org.example.classes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OddIntegersTest {

    OddIntegers oddIntegers;
    @BeforeEach
    void setUp() {
        oddIntegers =new OddIntegers();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createArray_takeOdds() {
        int[] expectedResult = {1, 3, 5,7,9};
        List<Integer> result = oddIntegers.getOddNumbers(9);
    }

    @Test
    void createArray_takeOdds2() {
        int[] expectedResult = {1, 3, 5,7,9,11,13,15};
        List<Integer> result = oddIntegers.getOddNumbers(16);
    }
}