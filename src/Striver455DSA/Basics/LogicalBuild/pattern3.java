package Striver455DSA.Basics.BasicRecursion.BasicMaths.LogicalBuild;


import java.util.Scanner;

//we need to print this
//1
//12
//123
//1234
//12345
public class pattern3 {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the max value for the pattern :- ");
        int n = Sc.nextInt();
        for(int i= 1; i<=n; ++i){
            for(int j =1; j<=i; j++){
                System.out.print(j+"");

            }System.out.println();

        }


    }

}
