package weekPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int i_size = arr.get(0).size();
        int j_size = arr.size();
        int startDiag=0, endDiag=0;
        for (int i = 0; i< i_size; i++ ) {
            for (int j = 0; j<j_size ; j++) {
                if (i==j) {
                    startDiag += arr.get(i).get(j);
                }
                if (i+j == i_size-1){
                    endDiag += arr.get(i).get(j);
                }
            }
        }

        //System.out.println(i_size +" "+ j_size + " " + startDiag + " " + endDiag);
        return Math.abs(startDiag-endDiag);
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();

        // Option 1: Using Arrays.asList and wrapping in new ArrayList (to allow modifications)
        arr.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        arr.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        arr.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        System.out.println(diagonalDifference(arr));
    }
}
