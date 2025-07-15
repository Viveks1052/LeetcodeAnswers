package Striver455DSA.BasicMaths;

public class CountAllDigitOfANumber {

    public static void main(String[] args) {

        int n = -36847;
        int result = countDigit(n);
        System.out.println("Number of digits are = "+result);
    }
    public static int countDigit(int n) {

        int count = 0;
        if(n==0) return 1;
        while(n != 0){
            n = n/10;
            count++;

        }
        return count;

    }

}
