package Striver455DSA.Basics.BasicRecursion;

public class ReverseArrayUsingRecursion {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        reverseArrayLogic(arr, 0, arr.length - 1);

        System.out.print("Reversed Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    private static int[] reverseArrayLogic(int[] arr, int start, int end) {

        if (start >= end) return arr;

        // Swap elements at start and end
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call with narrowed bounds
        return reverseArrayLogic(arr, start + 1, end - 1);
    }

}

