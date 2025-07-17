package Striver455DSA.Basics.BasicHashing;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfTheValues {

    public static void main(String[] args) {

        int[] originalArray = {1,2,3,2,3,5,7,3,7,8,9,7};

        //For every number I find, add 1 to its current count. If it’s not there yet, assume the count is 0.
        Map<Integer, Integer> frequencyOfNumbers = new HashMap<>();

        for(int num : originalArray){
            frequencyOfNumbers.put(num, frequencyOfNumbers.getOrDefault(num, 0)+1);
        }

        System.out.println(frequencyOfNumbers);


    }
}
