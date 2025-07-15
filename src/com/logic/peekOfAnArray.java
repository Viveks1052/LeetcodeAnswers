package com.logic;


import java.util.Arrays;

public class peekOfAnArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        int result = peekElement(arr);
        System.out.println("Peak element is "+result);
     }

    private static int peekElement(int[] arr) {
      if (arr.length==0){
          System.out.println("Arrays is Empty");
          return -1;

      }
      int max = arr[0];
      for(int i = 0; i<arr.length-1; i++){
          if(arr[i] > max) {
              max = arr[i];
          }

      }
      return max;

    }
}
