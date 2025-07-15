package com.Striver79;


public class MaximumSumKadanesAlgo {

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int sum = maxSubArray(arr);
        System.out.println(sum);
    }

    public static int maxSubArray(int[] nums) {

        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);

        }

        return maxSum;
    }
}
