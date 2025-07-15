package Striver455DSA.BasicMaths;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MathematicsLogics {

    public static void main(String[] args) {

        int number  = 1232713098;
        List<Integer> values = getDigit(number);
        System.out.println(values);
    }

    private static List<Integer> getDigit(int number) {

        List<Integer> result = new ArrayList<>();
        while(number>0){
            int digit  = number%10;
            result.add(digit);
            number = number/10;

        }
        Collections.reverse(result);
    return result;

    }
}
