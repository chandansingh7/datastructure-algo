package stream;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStream {

    //A type of stream that enables prallel processing of elements
    // Allowing multiple threads to process parts of the stream simultaneously
    // This can significantly improve performance for large data set
    // workload is distributed across multiple threads

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x-> x+1).limit(20000).toList();
        list.stream().map(ParallelStream::factorial).toList();
        long endtTime = System.currentTimeMillis();
        System.out.println("Time taken sequential:" + (endtTime - startTime) + "ms");


        startTime = System.currentTimeMillis();
        list = Stream.iterate(1, x-> x+1).limit(20000).toList();
        list.parallelStream().map(ParallelStream::factorial).toList();
        //list.parallelStream().map(ParallelStream::factorial).sequential().toList();
        endtTime = System.currentTimeMillis();
        System.out.println("Time taken sequential:" + (endtTime - startTime) + "ms");

        // Parallel stream are most effective for CPU-intensive or large dataset where task are independent
        // They may add overhead for simple tasks or small datasets

        //Comulatve sum
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> cumulativeSum = numbers.parallelStream().map(sum::addAndGet).toList();
        System.out.println("expected [1,3,6,10,15]");
        System.out.println("actual" + cumulativeSum);
    }

    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i<=n; i++) {
            result *= i;
        }
        return result;
    }


}
