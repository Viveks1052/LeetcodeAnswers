package com.leetCode;

public class NextPermutation {

    public static void main(String[] args) {


    }


    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }

            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
        int k = i + 1;
        int l = nums.length - 1;
        while (k < l) {
            int temp = nums[k];
            nums[k] = nums[l];
            nums[l] = temp;
            k++;
            l--;
        }
    }

}






