package Striver455DSA.Basics.BasicHashing;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharacters {
    public static void main(String[] args) {

        String str = "abdjwoiefjoihsi";

        char[] ch = str.toCharArray();

        System.out.println(ch);

        Map<Character, Integer> frequency = new HashMap<>();

        for(char c: ch){
            frequency.put(c, frequency.getOrDefault(c, 0)+1);
        }
        System.out.println(frequency);
    }
}
