package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOps {

    public static void main(String[] args) {



        List<Integer> list= Arrays.asList(1,2,3);

        //1. collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();

        //2.foreach
        list.forEach(System.out::println);

        //3. reduce : combines elements to produce a single result
        Optional<Integer> optionalInteger = list.stream().reduce(Integer::sum);
        System.out.println(optionalInteger.get());

        //4. count

        //5. anyMatch, allMatch, noneMatch are shot circuit methods
        boolean b = list.stream().anyMatch(x -> x %2==0);
        System.out.println(b);

        boolean b1 = list.stream().allMatch(x-> x>0);
        System.out.println(b1);

        boolean b2 = list.stream().noneMatch(x-> x<0);
        System.out.println(b2);

        //6. findFirst, findAny is shor circuit methods
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());


        //7. toArray
        Object[] array = Stream.of(1,2,3).toArray();

        //8. min/ max
        System.out.println("max:" + Stream.of(2,4,6).max((o1,o2) -> o1 - o2).get());
        System.out.println("max:" + Stream.of(2,4,6).max(Comparator.naturalOrder()).get());
        System.out.println("min:" + Stream.of(2,4,6).min(Comparator.naturalOrder()).get());

        //9. forEachOrdered
        List<Integer> list1= Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("using foreach with parallel stream");
        list1.parallelStream().forEach(System.out::print);
        System.out.println("using forEachOrdered with parallel stream");
        list1.parallelStream().forEachOrdered(System.out::print);

        //squaring and sorting
        List<Integer> integers= Arrays.asList(1,2,3, 4, 5);
        System.out.println(integers.stream().map(x-> x*x).sorted().toList());

        //sum 1 to every numbers
        List<Integer> numbers= Arrays.asList(1,2,3, 4, 5);
        System.out.println(numbers.stream().map(x -> x + 1).toList());

        //sum of all numbers
        List<Integer> numberSum= Arrays.asList(1,2,3, 4, 5);
        System.out.println(numberSum.stream().reduce(Integer::sum).get());

        //counting occurrence of a character
        String str = "Hello world ll";
        System.out.println(str.chars().filter(x -> x == 'l').count());

        //stateful stateless

    }
}
