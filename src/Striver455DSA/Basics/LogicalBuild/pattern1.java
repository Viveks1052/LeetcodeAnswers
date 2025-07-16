package Striver455DSA.Basics.BasicRecursion.BasicMaths.LogicalBuild;


import java.util.Scanner;

// we need to print *****
//                  *****
//                  *****
//                  *****
//                  *****
public class pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns :- ");
        int rows = sc.nextInt();
        int cloumns = sc.nextInt();
        pattern(rows,cloumns);

    }
    public static void pattern(int rows, int columns){
        for(int i = 0; i<rows; ++i){
            for(int j = 0; j<columns; ++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
