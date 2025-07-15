package com.leetCode;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indexes: " + result[0] + ", " + result[1]);


    }
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> complements = new HashMap<>();

        for(int i = 0; i<nums.length; ++i){
            int complement = target-nums[i]; // We get the Required value that has to be added to get the target.
            if(complements.containsKey(complement)){
                return new int[] {complements.get(complement), i};
            }
            complements.put(nums[i], i);  // we need to store elements too

        }

        return new int[]{};

    }
}
