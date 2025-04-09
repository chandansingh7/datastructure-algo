package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOps {

    public static void main(String[] args) {
        //Intermediate operations transform a stream into another stream
        //They are lazy, meaning they don't execute until a terminal operation is invoked

        // 1.filter
        List<String> list = Arrays.asList("aasdf", "badf","casdf", "casdf", "cesdf", "fasd");
        Stream<String> filterdStream = list.stream().filter(x -> x.startsWith("c"));

        //no filterning shinc we don't have terminal function like collect or count or else
        long res = list.stream().filter(x -> x.startsWith("c")).count();
        System.out.println(res);

        // 2. map
        Stream<String> stringStream = list.stream().map(String::toUpperCase);

        // 3. sorted
        Stream<String> sorted = list.stream().sorted();
        Stream<String> sortedStreamUsingComparator = list.stream().sorted((a,b) -> a.length() - b.length());

        // 4. distinct
        System.out.println(list.stream().filter(x-> x.startsWith("c")).distinct().count());

        // 5. limit
        System.out.println(Stream.iterate(1, x-> x+1).limit(100).count());

        //6. skip
        System.out.println(Stream.iterate(1, x -> x+1).skip(10).limit(100).count());

        //7. peek
        //perform and action on each element as it is combined
        Stream.iterate(1, x -> x+1).skip(10).limit(100).peek(System.out::println).count();

        //8. flatMap
        // Handle streams of collections, lists, or arrays where each element is itself a collection
        // Flatten nested structure (eg, lists within lists) so that they can be processed as a single sequence of elements
        // Transform and flatten elements at the same time
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("orange", "kiwi"),
                Arrays.asList("pear", "grape")
        );
        System.out.println(listOfLists.stream().flatMap(x-> x.stream()).map(String::toUpperCase).toList());

        List<String> sentenses = Arrays.asList(
                "Hello world",
                "Java streams are powerful",
                "flatMap is useful"
        );
        System.out.println(
                sentenses.stream().flatMap(sentense -> Arrays.stream(sentense.split(" ")))
                        .map(String::toUpperCase)
                        .toList()
        );



    }
}
