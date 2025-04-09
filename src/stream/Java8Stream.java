package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Java8Stream {

    // Java 8 --> minimal code, functional programming
    // Java 8 --> lambda expression, Stream, Data & Time API

    // lambda expression
    // lambda expression in anonymous function(no name, no return type, no access modifiers)

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            System.out.println("hello");
        });

        MathOperation sumOperation = (Integer::sum);
        MathOperation subtractOperation = (a, b) -> a-b;
        System.out.println(sumOperation.operate(1,2));
        System.out.println(subtractOperation.operate(4,2));

        // Predicate --> holds condition
        // Predicate --> functional interface (boolean valued function)
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4));

        Predicate<String> isWordStartingWithC = x -> x.toLowerCase().startsWith("c");
        Predicate<String> isWordEndingWithN = x -> x.toLowerCase().endsWith("n");
        Predicate<String> and = isWordStartingWithC.and(isWordEndingWithN);
        System.out.println(and.test("Chandan"));

        // Function
        Function<Integer, Integer>  doubleit = x -> x*2;
        Function<Integer, Integer>  triple = x -> x*3;
        System.out.println(doubleit.andThen(triple).apply(20));
        System.out.println(doubleit.compose(triple).apply(20));
        System.out.println(doubleit.apply(100));
        Function<Integer, Integer> identity = Function.identity();
        Integer res2 = identity.apply(5);
        System.out.println(res2);

        //Consumer
        Consumer<Integer> consumer = (x) -> System.out.println(x);
        consumer.accept(51);
        List<Integer> list = Arrays.asList(1, 2, 3);

        Consumer<List<Integer>> printList = x -> {
            for (int i: x) {
                System.out.println(i);
            }
        };

        printList.accept(list);

        // Supplier
        Supplier<String> giveHelloWold = () -> "Hello World";
        System.out.println(giveHelloWold.get());

        //combined example
        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x*x;
        Consumer<Integer> consumer1 = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if (predicate.test(supplier.get())) {
            consumer1.accept(function.apply(supplier.get()));
        }

        BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x+y)%2==0;
        System.out.println(isSumEven.test(5,5));

        BiConsumer<Integer, String> biConsumer=(x,y)-> {
            System.out.println(x);
            System.out.println(y);
        };
        BiFunction<String, String, Integer> biFunction = (x, y) -> (x+y).length();
        System.out.println(biFunction.apply("abc","def"));

        UnaryOperator<Integer>  doublea = x -> x*2; // used if we know input and return both are same Integer
        BinaryOperator<Integer> sum = (x,y) -> x+y;

        //Method reference --> use mehotd without invoking & in place of lamda expression
        List<String> list1 = Arrays.asList("ram", "shyam","naryan");
        list1.forEach(x -> System.out.println(x));
        list1.forEach(System.out::println);

        //Constuctor reference
        List<String> names = Arrays.asList("A", "B", "C");
        List<MobilePhone> mobilePhones1 = names.stream().map(x -> new MobilePhone(x)).collect(Collectors.toList());

        List<MobilePhone> mobilePhones = names.stream().map(MobilePhone::new).collect(Collectors.toList());

    }
}

class MobilePhone{
    String name;

    public MobilePhone(String name){
        this.name = name;
    }
}

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}