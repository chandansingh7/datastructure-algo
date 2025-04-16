package insertion;

import java.util.Arrays;

public class InsertionSort {

    public static int[] sort(int[] values) {

        for (int i=1; i<values.length;i++){
            int temp = values[i];
            int j = i -1;
            while (j >= 0 && values[j] > temp) {
                values[j+1] = values[j];
                j--;
            }
            values[j+1] = temp;
        }
        return values;
    }

    public static void main(String[] args) {
        Arrays.stream(sort(new int[]{1, 2, 3, 45, 6})).forEach(x -> System.out.println(x));
    }
}
