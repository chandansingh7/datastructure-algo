package stream;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorDemo {

    public static void main(String[] args) {
        // collector is a utility method
         // provides a set of methods to create common collectors

        //collecting to list
        List<String> names = Arrays.asList("Alice", "bob", "charlie");
        List<String> res = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(res);

        //toSet
        List<Integer> num = Arrays.asList(1,2,2,3,3,4,5,4,5,7);
        Set<Integer> set = num.stream().collect(Collectors.toSet());
        System.out.println(set);

        // to specific collections
        ArrayDeque<String> collect = names.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));
        System.out.println("collect to sepcific:" +collect);

        // joining string
        String concatname = names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(concatname);

        // summarizing data
        List<Integer> numsummary = Arrays.asList(1,2,2,3,3,4,5,4,5,7);
        IntSummaryStatistics statistics = numsummary.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("count "+ statistics.getCount());
        System.out.println("sum "+ statistics.getSum());
        System.out.println("min "+ statistics.getMin());
        System.out.println("average " + statistics.getAverage());
        System.out.println("max " + statistics.getMax());

        // calculating averages
        Double average = numsummary.stream().collect(Collectors.averagingInt(x->x));
        System.out.println("Average calc : " +  average);

        // counting elements
        Long count = numsummary.stream().collect(Collectors.counting());
        System.out.println("count: "+count);

        // grouping elements
        List<String> word = Arrays.asList("hello", "world", "java", "stream", "collecting");
        System.out.println(word.stream().collect(Collectors.groupingBy(String::length)));
        System.out.println(word.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", "))));
        System.out.println(word.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())));
        //can be map to any key value
        HashMap<Integer, Long> treeMap = word.stream().collect(Collectors.groupingBy(String::length, HashMap::new, Collectors.counting()));
        System.out.println(treeMap);

        // partitioning element
        System.out.println(word.stream().collect(Collectors.partitioningBy(x -> x.length() > 5)));

        // mapping and collecting
        //applies a mapping function before collecting
        System.out.println(word.stream().collect(Collectors.mapping(x->x.toUpperCase(), Collectors.toList())));

    }
}
