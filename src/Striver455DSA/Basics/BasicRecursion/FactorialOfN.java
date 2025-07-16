package Striver455DSA.Basics.BasicRecursion;

import java.util.Scanner;

public class FactorialOfN {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value:- ");
        int N = scan.nextInt();
        int factorial = factorialCalculation(1, N);
        System.out.println(factorial);
    }

//
private static int factorialCalculation(int i, int n) {
    if (i > n) return 1; // base case
    return i * factorialCalculation(i + 1, n);
}

}
