package com.anagrams.service;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsCheckerTest {

    private AnagramsChecker anagramsChecker = new AnagramsCheckerImpl();

    @Test
    public void testIsAnagram() {
        assertTrue(anagramsChecker.isAnagram("silent", "listen"));
        assertTrue(anagramsChecker.isAnagram("racecar", "racecar"));
        assertTrue(anagramsChecker.isAnagram("racecar", "carrace"));
        assertTrue(anagramsChecker.isAnagram("hello", "olleh"));

        assertFalse(anagramsChecker.isAnagram("silent", "silentt"));
        assertFalse(anagramsChecker.isAnagram("hello", "world"));
    }

    @Test
    public void testGetAnagrams() {
        List<String> anagrams = anagramsChecker.getAnagrams("silent");

        assertTrue( anagrams.size() > 1);
        assertTrue(anagrams.contains("listen"));
        assertTrue(anagrams.contains("sentil"));

        anagrams = anagramsChecker.getAnagrams("racecar");

        assertTrue( anagrams.size() > 1);
        assertTrue(anagrams.contains("racecar"));

        anagrams = anagramsChecker.getAnagrams("hello");

        assertTrue( anagrams.size() > 1);
        assertTrue(anagrams.contains("olleh"));
    }

}