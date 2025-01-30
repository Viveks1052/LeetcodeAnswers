package com.leetCode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithOutRepeatingCharacters {

    public static void main(String[] args) {
        String s = "abcabcaabb";
        System.out.println("Longest Substring: " + findLongestSubstring(s));
    }

    public static String findLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        int right = 0, left = 0, maxLength = 0;
        String longestSubstring = "";

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    longestSubstring = s.substring(left, right + 1);
                }
                right++;
            } else {
                set.remove(s.charAt(left));
                left++; // Fix: Move left only when a duplicate is found
            }
        }
        System.out.println(longestSubstring.length());
        return longestSubstring;
    }

    }


