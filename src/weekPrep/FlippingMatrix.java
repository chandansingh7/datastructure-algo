package weekPrep;

import java.util.List;

public class FlippingMatrix {

    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here
        int n = matrix.size() / 2;
        int maxSum = 0;

        // Iterate over the top-left quadrant (n x n)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Find the maximum value among the four symmetric positions:
                // (i, j), (i, 2n - j - 1), (2n - i - 1, j), and (2n - i - 1, 2n - j - 1)
                int a = matrix.get(i).get(j);
                int b = matrix.get(i).get(2 * n - j - 1);
                int c = matrix.get(2 * n - i - 1).get(j);
                int d = matrix.get(2 * n - i - 1).get(2 * n - j - 1);

                // Add the maximum of these four elements to maxSum
                maxSum += Math.max(Math.max(a, b), Math.max(c, d));
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

    }
}
//Input (stdin)
//
//Run as Custom Input
//|
//Download
//1
//2
//112 42 83 119
//56 125 56 49
//15 78 101 43
//62 98 114 108
//Your Output (stdout)
//414