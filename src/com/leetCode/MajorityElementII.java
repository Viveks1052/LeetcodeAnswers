package com.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MajorityElementII {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        int threshold = n / 3;  ///{2,3,2,3}

        Arrays.sort(nums);  //{2,2,3,3}
        int prev = nums[0], count = 0;

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
        if (count > n / 3) {
            result.add(prev);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,2,3};
        majorityElement(arr);

    }
}