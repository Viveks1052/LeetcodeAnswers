package com.logic;

public class AllSubstring {
    public static void main(String[] args) {
        String str = "ababc";

        int length = str.length();

        int max = 0;  

        String palindronic = " ";

        for(int i = 0; i<length; i++){
            for(int j = i+1; j<=length; j++){
                String sub = str.substring(i,j);
                StringBuilder sb = new StringBuilder(sub);
                String reverse = sb.reverse().toString();
                System.out.println("SubString is "+ sub +" Reverse of it is "+ reverse);
                if(sub.equals(reverse)){
                    System.out.println("Palindrome" + sub.length());
                    if(sub.length()>max){
                        max = sub.length();

                        System.out.println(sub);
                    }
                }

            }
        }
    }
}
