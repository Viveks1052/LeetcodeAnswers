package Striver455DSA.Basics.BasicRecursion.BasicMaths;

public class PalinDroneNumber {

    public static void main(String[] args) {

        int number  = 121;
        boolean result = checkPalindrone(number);
        System.out.println(result);
//        if(result==number){
//            System.out.println("It is a Palidrone ");
//        }else System.out.println("It is not Palidrone");

    }

    private static boolean checkPalindrone(int number) {
        int original = number;
        int LastDigit = 0;
        int ReverseNumber = 0;
        while(number>0){
            LastDigit = number%10;  // This will get the last digit of a number
            ReverseNumber = ReverseNumber*10+LastDigit;  // This will calculate the Reverse
            number = number/10; // This will remove the last Digit.

        }return ReverseNumber==original;
    }
}
