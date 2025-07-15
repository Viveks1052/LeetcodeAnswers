package com.Striver79;

public class CountNumberOfSubarraysWithGivenXorK {

    public static void main(String[] args) {
        int[] arr = {4,2,2,6,4};
        int k = 6;
        long result = subarrayXor(arr,k);
        System.out.println(result);
    }

    public static long subarrayXor(int arr[], int k) {
        int n = arr.length;
        // int xor = 0;
        long count=0;
        for (int i = 0; i < n; i++) {
            int xor = 0;
            for (int j = i; j < n; j++) {
                xor ^= arr[j];
                if (xor == k) {
                    count++;
                }
            }
        }
        return count;

    }
}
