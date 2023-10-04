package com.anagrams;

import com.anagrams.service.AnagramsChecker;
import com.anagrams.service.AnagramsCheckerImpl;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static AnagramsChecker anagramsChecker = new AnagramsCheckerImpl();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Anagram Checker!");

        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1. Check if two texts are anagrams");
            System.out.println("2. Get all anagrams for a given string");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the first text:");
                    String text1 = scanner.next();

                    System.out.println("Enter the second text:");
                    String text2 = scanner.next();

                    if (anagramsChecker.isAnagram(text1, text2)) {
                        System.out.println("The two texts are anagrams.\n");
                    } else {
                        System.out.println("The two texts are not anagrams.\n");
                    }
                    break;
                case 2:
                    System.out.println("Enter the string to get anagrams for:");
                    String text = scanner.next();

                    List<String> anagrams = anagramsChecker.getAnagrams(text);

                    if (anagrams.isEmpty()) {
                        System.out.println("There are no anagrams for the given string.\n");
                    } else {
                        System.out.println("The anagrams for the given string are:");
                        for (String anagram : anagrams) {
                            System.out.println(anagram);
                        }
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.\n");
            }
        }
    }
}