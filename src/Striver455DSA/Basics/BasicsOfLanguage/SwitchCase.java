package Striver455DSA.Basics.BasicRecursion.BasicMaths.BasicsOfLanguage;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the day :- ");
        int day = sc.nextInt();

        whichWeekDay(day);

    }

    public static void whichWeekDay(int day) {

        if (day > 6 || day < 1) {
            System.out.println("Invalid");
        }
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }
}

