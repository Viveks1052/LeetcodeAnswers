package Striver455DSA.Basics.BasicRecursion.BasicMaths;

public class PrimeCheck {

    public static void main(String[] args) {

        int number  = 95;
        String result = checkPrime(number);
        String resultOptimised = checkPrimeOptimsed(number);
        System.out.println(resultOptimised);

        System.out.println(result);
    }

    private static String checkPrime(int number) {
        int count = 0;
        for(int i = 1; i<=number; i++){
            if(number%i==0) count++;
        }
        if(count>2) return "No";
        else return "yes";
    }

//     Optimised version here
     private static String checkPrimeOptimsed(int number) {
    if (number < 2) return "No";  // 0 and 1 are not prime
    for (int i = 2; i * i <= number; i++) {
        if (number % i == 0) return "No";
    }
    return "Yes";
}

}
