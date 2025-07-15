package Striver455DSA.BasicMaths;

import java.sql.SQLOutput;

public class ReverseNumber {

    public static void main(String[] args) {
        int actualNumber  = -11;
        int ReverseNumber  = reverseNumberLogic(actualNumber);
        System.out.println("The Reverse of a Number is = "+ ReverseNumber);
    }

    private static int reverseNumberLogic(int actualNumber) {

        int LastDigit=0;
        int ReverseNumber=0;
        while(actualNumber>0){
            LastDigit = actualNumber%10;
            System.out.print("Last Digit is "+LastDigit);
            System.out.println();
            ReverseNumber = ReverseNumber*10+LastDigit;
            System.out.print(" Reverse Number is "+ReverseNumber);
            System.out.println();
            actualNumber = actualNumber/10;
            System.out.print(" Actual number will be "+actualNumber);
            System.out.println();

        }return ReverseNumber;
    }
}
