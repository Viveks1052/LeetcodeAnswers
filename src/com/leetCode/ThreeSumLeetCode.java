package com.leetCode;

import java.util.*;

public class ThreeSumLeetCode {

    public static void main(String[] args) {

//        int[] nums = {-1,0,1,2,-1,-4};
        int[] nums = {-1, 0, 1, 0};
        System.out.println(threeSum(nums));


    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int target = 0;
//        Arrays.sort(nums);
//        Set<List<Integer>> s = new HashSet<>();
////        Set<Integer> s = new HashSet<>();
//        List<List<Integer>> output = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++){
//            int j = i + 1;
//            int k = nums.length - 1;
//            while (j < k) {
//                int sum = nums[i] + nums[j] + nums[k];
//                if (sum == target) {
//                    s.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                    j++;
//                    k--;
//                } else if (sum < target) {
//                    j++;
//                } else {
//                    k--;
//                }
//            }
//        }
//        output.addAll(s);
//        return output;
//    }

        Arrays.sort(nums);

        Set<List<Integer>> s = new HashSet<>(); // For adding triplet in Set
        List<List<Integer>> output = new ArrayList<>(); // for final output
        for (int i = 0; i < nums.length; ++i) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    s.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    i++;
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        output.addAll(s);
        return output;


    }
}
