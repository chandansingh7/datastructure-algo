package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StreamDemo {

    public static void main(String[] args) {
        // feature introduce in java 8
        // process collections of data in a functional and declarative
        // simplify data processing
        // embrace functional programming
        // Improve readability and maintainability
        // Enable easy parallelism


        //how to use stream ? -> a sequesnce of elements supports functional and declearative programming
        //source, intermediate operations & terminal operation

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(numbers.stream().filter(x -> x % 2 ==0).count());


        ///creating streams
        //1. from collections
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = list.stream();
        //2. from arrays
        String[] array = {"a", "b","c"};
        Stream<String> stream1 = Arrays.stream(array);
        //3. using stream.of()
        Stream<String> stream2 = Stream.of("a","b","c");
        //4 infinite streams
        Stream<Integer> integerStream = Stream.generate(() -> 1);
        Stream.iterate(1, x->x+1); //.limit(100).collect(toList());
//        System.out.println(integers);


    }
}
