package com.leetCode;

import java.util.Arrays;

class MedianOfTwoArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int length = nums1.length+nums2.length;
        double[] result = new double[length];
        for(int i =0 ; i<nums1.length ; ++i){

            result[i] = nums1[i];

        }
        for(int i =0 ; i<nums2.length ; i=i+1){

            result[nums1.length+i] = nums2[i];

        }

        Arrays.sort(result);

        int start = 0;
        int end = result.length-1;


        int median =start+(end-start)/2;
        double value = (result[median] +result[median+1])/2;

        if(median%2==0){
            return result[median];

        }else

            return value;


    }


    public static void main(String[] args) {
        int[] num1 = {1,3};
        int[] num2 = {2};

        double median = findMedianSortedArrays(num1, num2);

        System.out.println("Median= "+median);
    }
}