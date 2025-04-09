package weekPrep;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMax {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        long min=0, max=0;

        for (Integer num: arr) {
            max+=num;
        }
        min= max - arr.get(arr.size()-1);
        max= max - arr.get(0);

        System.out.println(min +" "+ max);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(793810624, 895642170, 685903712, 623789054, 468592370);
        miniMaxSum(integers);
    }
}
