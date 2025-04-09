package goldman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {

        if (intervals.length <= 1) return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> resultList = new ArrayList<>();

        int[] newInterval = intervals[0];
        resultList.add(newInterval);

        for (int[] interval : intervals) {
            if (interval[0] <= newInterval[1]){

                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }else {
                newInterval = interval;
                resultList.add(newInterval);
            }

        }

        return resultList.toArray(new int[resultList.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};
        System.out.println(merge(intervals));
       // merge(intervals);
    }

}
