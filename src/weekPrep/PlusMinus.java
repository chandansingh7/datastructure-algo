package weekPrep;

import java.util.Arrays;
import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        float zero=0, plus=0, minus = 0;
        int length = arr.size();
        // Write your code here
        for (Integer val: arr){
            if (val < 0) {
                minus ++;
            }
            if (val > 0 ) {
                plus++;
            }
            if (val == 0){
                zero++;
            }
        }
        System.out.printf("%.6f\n", Math.abs(plus/length));
        System.out.printf("%.6f\n", Math.abs(minus/length));
        System.out.printf("%.6f\n", Math.abs(zero/length));
    }

    public static void main(String[] args) {
       List<Integer> arr = Arrays.asList(-4, 3, -9, 0, 4, 1);
       plusMinus(arr);
    }
}
