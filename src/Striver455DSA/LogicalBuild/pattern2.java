package Striver455DSA.LogicalBuild;

import java.util.Scanner;




import java.sql.SQLOutput;
import java.util.Scanner;

    // we need to print *****
//*
//**
//***
//****
//*****
    public class pattern2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the rows and columns :- ");
            int rows = sc.nextInt();
            int cloumns = sc.nextInt();
            pattern(rows,cloumns);

        }
        public static void pattern(int rows, int columns){
            for(int i = 0; i<=rows; ++i){
                for(int j = 0; j<=columns; ++j){
                    if(i>j) {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }

    }


