package com.anagrams.service;

import java.util.List;

public interface AnagramsChecker {

    public boolean isAnagram(String str1,  String str2);
    public List<String> getAnagrams(String str);

}
