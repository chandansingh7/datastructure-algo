package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        int[] arr = new int[2];

        for(int i = 0; i < n; i++) {
            for(int j = 1; j < n -1; j++) {
                if(nums[i] + nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        Arrays.sort(arr);

        return arr;
    }

    public static int[] twoSumMap(int[] nums, int target) {

        Map<Integer, Integer> integerMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int minusSum = target - nums[i];

            if (integerMap.containsKey(minusSum)){
                System.out.println("int-map " + integerMap.get(minusSum));
                return new int[]{integerMap.get(minusSum), i};
            }

            integerMap.put(nums[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
       int[] nums = {3,2,4};
       int target = 6;
        System.out.println(Arrays.toString(twoSumMap(nums, target)));
    }
}
