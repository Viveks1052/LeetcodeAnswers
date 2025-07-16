package Striver455DSA.Basics.BasicRecursion.BasicMaths;

public class ArmStrongNumber {

    public static void main(String[] args) {

        int number  = 153;

        boolean Armstrong = checkArmstrong(number);

        System.out.println(Armstrong);
    }

    private static boolean checkArmstrong(int number) {
        int original = number;
        int SumOfDigit=0;
         while (number>0){
             int digit = number%10;
             SumOfDigit+=digit*digit*digit;
             number=number/10;
         }
         if(SumOfDigit==original) return true;
         else  return false;
    }
}
