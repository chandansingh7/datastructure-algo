package LeetCode.meta;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {

    public static boolean containsDuplicate(int[] nums) {

        return Arrays.stream(nums).distinct().count() < nums.length;
    }

    public static boolean containsDuplicate2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicate3(int[] nums) {

        for (int i=1; i<nums.length;i++){
            int temp = nums[i];
            int j = i -1;


            while (j >= 0 && nums[j] > temp) {

                nums[j+1] = nums[j];
                j--;
            }
            if (temp == nums[j]){
                return true;
            }
            nums[j+1] = temp;
        }

//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//
//            for (int j = i+1; j < n; j++){
//                if (nums[i] == nums[j]) {
//                    return true;
//                }
//            }
//        }
        return false;
    }


    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4};
        System.out.println(containsDuplicate3(values));
    }
}
