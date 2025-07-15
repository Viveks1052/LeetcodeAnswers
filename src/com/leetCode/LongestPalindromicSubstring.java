package com.leetCode;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
     String s = "bahsbhabd";
     longestPalindrome(s);

    }

    public static void longestPalindrome(String s){
        int l=0,r=0;
        int length = s.length();
//        while(r<length){
//
//        }
        for(int i=0; i<length;++i){
            for(int j = i+1; j<=length; ++j){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
