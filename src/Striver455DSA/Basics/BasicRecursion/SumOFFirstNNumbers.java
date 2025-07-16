package Striver455DSA.Basics.BasicRecursion;

import java.util.Scanner;

public class SumOFFirstNNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the last value:- ");
        int N = scan.nextInt();
        int Sum = sumcalculation(1,N);
        System.out.println(Sum);
    }

    private static int sumcalculation(int i, int n) {
        int sum =0;
        if(i>n) return -1;
        else return i + sumcalculation(i + 1, n);

    }
}
