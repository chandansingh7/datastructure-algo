package stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PremetiveStream {

    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5,6};

        IntStream stream = Arrays.stream(ints);

        System.out.println(IntStream.range(1, 5).boxed().collect(Collectors.toList()));
        System.out.println(IntStream.rangeClosed(1, 5).boxed().collect(Collectors.toList()));

        IntStream.of(1,2,4);

        DoubleStream doubleStream = new Random().doubles(5);
        System.out.println(doubleStream.mapToInt(x -> (int) + 1).boxed().toList());
//        System.out.println(doubleStream.boxed().toList());

        IntStream intStream = new Random().ints(5);
        System.out.println(intStream.boxed().toList());
    }
}
