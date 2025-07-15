package Striver455DSA.BasicMaths;

//You are given two integers n1 and n2. You need find the Greatest Common Divisor (GCD) of the two given numbers.
//Return the GCD of the two numbers.
//The Greatest Common Divisor (GCD) of two integers is the largest positive integer that divides both of the integers.

import java.util.ArrayList;
import java.util.List;

public class GCDORHCF {
    public static void main(String[] args) {

        int n1 = 1000020222, n2 = 1236828384;
        int HCF  = GCD( n1, n2);
        System.out.println(HCF);


    }

    private static int GCD(int n1, int n2) {

        if(n1==0 || n2==0){
            System.out.println("No Factors can be found..");
        }

        List<Integer> firstValue = new ArrayList<>();
        List<Integer> secondValue = new ArrayList<>();

        for(int i = 1; i<=n1; i++){
            if(n1%i==0){
                firstValue.add(i);
            }

        }
        System.out.println("Multiples of First = "+firstValue);
        for(int i = 1; i<=n2; i++){
            if(n2%i==0){
                secondValue.add(i);
            }

        }
        System.out.println("Multiples of Second = "+secondValue);

        int gcd = 1;
        for (int i : firstValue) {
            if (secondValue.contains(i)) gcd = Math.max(gcd, i);
        }

        return gcd;

    }
}
