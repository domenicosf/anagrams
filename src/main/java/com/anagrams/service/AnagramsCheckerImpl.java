package com.anagrams.service;

import java.util.*;

public class AnagramsCheckerImpl implements AnagramsChecker{
    @Override
    public boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            table[str1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            table[str2.charAt(i) - 'a']--;
            if (table[str2.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public List<String> getAnagrams(String str) {
        Set<String> anagrams = new HashSet<>();

        // If the string is empty, return an empty list.
        if (str.isEmpty()) {
            return new ArrayList<>();
        }

        // Add the string to the set of anagrams.
        anagrams.add(str);

        // For each character in the string, recursively call the getAnagrams() function
        // to find anagrams of the remaining string after the character is removed.
        for (int i = 0; i < str.length(); i++) {
            String remainingString = str.substring(0, i) + str.substring(i + 1);
            List<String> anagramsOfRemainingString = getAnagrams(remainingString);

            for (String anagramOfRemainingString : anagramsOfRemainingString) {
                anagrams.add(anagramOfRemainingString + str.charAt(i));
            }
        }

        return new ArrayList<>(anagrams);
    }
}
