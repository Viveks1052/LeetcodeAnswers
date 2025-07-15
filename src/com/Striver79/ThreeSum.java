package com.Striver79;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {

        int[] arr = {-1,0,1,2,-1,-4};

        List<List<Integer>> result = threeSum(arr);

        // Print the result
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }


    }
    public static List<List<Integer>> threeSum(int[] nums) {

        int target =0;
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i<nums.length ; i++)
        {
            int j = i+1;
            int k = nums.length-1;
            while(j<k)
            {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==target){
                    set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }else if(sum<target){
                    j++;
                }else{
                    k--;
                }
            }

        }
        result.addAll(set);
        return result;
    }

}







