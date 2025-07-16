package Striver455DSA.Basics.BasicRecursion.BasicMaths.BasicsOfLanguage;

import java.util.Scanner;

public class UserInputOuput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value that needs to be printed :- ");

        printNumber(sc);

    }

    public static void printNumber(Scanner sc) {

        int number  = sc.nextInt();



        System.out.println(number);

    }
}
