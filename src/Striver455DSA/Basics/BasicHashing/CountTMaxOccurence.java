package Striver455DSA.Basics.BasicHashing;

import java.util.HashMap;
import java.util.Map;

public class CountTMaxOccurence {

    public static void main(String[] args) {

        String str = "abdjwoiefjoihsi";

        char[] ch = str.toCharArray();

        Map<Character, Integer> frequencyCount  = new HashMap<>();

//      for counting the characters
        for(char c: ch){
            frequencyCount.put(c, frequencyCount.getOrDefault(c,0)+1);
        }

        System.out.println(frequencyCount);
        int maxCount =0;

        char maxChar = ' ';


        for (Map.Entry<Character, Integer> entry : frequencyCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        System.out.println("Character with max occurrence: " + maxChar);
        System.out.println("Frequency: " + maxCount);



    }
}
