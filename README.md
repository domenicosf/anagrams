**README.md**

# Anagram Checker

This is an interactive Java program that provides two features:

1. Checks if two texts are anagrams of each other.
2. Gets all the anagrams for a given string.

To use the program, simply run it from the command line and select the feature you want to use.

**Examples:**

```
# Checking if two texts are anagrams
$ java AnagramChecker
Welcome to the Anagram Checker!

What do you want to do?
1. Check if two texts are anagrams
2. Get all anagrams for a given string
3. Exit

1

Enter the first text:
silent

Enter the second text:
listen

The two texts are anagrams.

# Getting all anagrams for a given string
$ java AnagramChecker
Welcome to the Anagram Checker!

What do you want to do?
1. Check if two texts are anagrams
2. Get all anagrams for a given string
3. Exit

2

Enter the string to get anagrams for:
silent

The anagrams for the given string will be a long list of strings, but one of the two strings listes will be:
listen
sentil
```

The program will automatically cache the results of previous anagram checks, so subsequent checks will be faster.

**Feedback**

If you have any feedback on the program, please feel free to create an issue on the GitHub repository.