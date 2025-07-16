package Striver455DSA.Basics.BasicRecursion;

import java.util.Scanner;

public class PrintNTo1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the biggest values :- ");
        int N = scan.nextInt();
        printDescending(N);
    }

    private static void printDescending(int N) {
        if (N == 0) return;

        System.out.print(N + " ");
        printDescending(N - 1);
    }

}
