package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluationDemo {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("alice", "bob", "charlie", "david");

        Stream<String> stream = strings.stream()
                .filter(name -> {
                    System.out.println("Filtered:" + name);
                    return name.length()>3;
                });
        System.out.println("Before Terminal");

        List<String> result = stream.collect(Collectors.toList());

        System.out.println("After Terminal");
        System.out.println(result);
    }
}
