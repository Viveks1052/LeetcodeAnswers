package Striver455DSA.Basics.BasicRecursion;

import java.util.Scanner;

public class PrintNTimesNameUsingRecursion {

    public static void main(String[] args) {

//        int N = 4;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of times the name has to be printed:- ");
        int N = scan.nextInt();
        namePrint(N);
        System.out.println();
        namePrint2(1,N);

    }

    private static void namePrint2(int i, int N) {

        if(i>N) return;

        System.out.println(i+" ");
        namePrint2(i+1, N);

    }

    private static void namePrint(int N) {

        if(N==0) return;

        else {
            System.out.print("Vivek"+" ");
            namePrint(N - 1);
        }

    }
}
