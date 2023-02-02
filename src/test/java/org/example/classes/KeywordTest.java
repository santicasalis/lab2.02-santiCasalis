package org.example.classes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeywordTest {

    private Keyword keywordIs;
    @BeforeEach
    void setUp() {
        keywordIs= new Keyword();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void Keywords_List() {
        assertEquals(true, keywordIs.isKeyword("Don´t break my heart"));

    }
}