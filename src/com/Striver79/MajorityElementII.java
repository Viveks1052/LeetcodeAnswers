package com.Striver79;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElementII {

    public static void main(String[] args) {

//        int[] arr = {3,2,3};
        int[] arr = {1,2};
        List<Integer> result = majorityElement(arr);

        System.out.println(result);
    }
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        int threshold = n / 3;  ///{2,3,2,3}

        Arrays.sort(nums);  //{2,2,3,3}
        int prev = nums[0], count = 0;


        // for (int i = 0; i < n; i++) {

        //    if(nums[i]==prevElement) count+=1;
        //    else if (count>n/3) result.add(prevElement);
        for (int i = 0; i < n; i++) {
            if (nums[i] == prev) {
                count++;
            } else if (count > n / 3) {
                result.add(prev);
                prev = nums[i];
                count = 1;
            } else {
                prev = nums[i];
                count = 1;
            }
        }


// After loop: check the last group
        if (count > n / 3) {
            result.add(prev);
        }

        return result;

    }
}
