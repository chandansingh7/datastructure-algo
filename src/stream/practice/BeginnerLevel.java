package stream.practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BeginnerLevel {
    //
    public static void filterEvenNumbers() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> even;
        List<Integer> odd;
        even = nums.stream().filter(x -> x % 2 == 0).toList();
        odd = nums.stream().filter(x -> x % 2 != 0).toList();

        even.forEach(System.out::println);
        odd.forEach(System.out::println);
    }

    public static void upperAllString() {
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        words.stream().map(x -> x.toUpperCase(Locale.ENGLISH)).forEach(System.out::println);
    }

    public static void countElements() {
        List<Integer> values = Arrays.asList(5, 12, 9, 3, 7, 21);

        long count = values.stream().filter(x -> x > 10).count();

        System.out.println(count);
    }

    public static void findFirstWordStartingWithA() {
        List<String> names = Arrays.asList("Tom", "Alice", "Bob", "Andrew", "Alex");

        String name = names.stream().filter(x -> x.startsWith("A")).findFirst().toString();
        System.out.println(name);
    }

    public static void countAllNumbers() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);


        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }

    public static void removeDuplicate() {
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        nums.stream().distinct().toList().forEach(System.out::println);
//        nums.stream().map(Integer::intValue).collect(Collectors.toSet()).forEach(System.out::println);
    }

    public static void convertListToMap() {
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange");

        fruits.stream().collect(Collectors.toSet()).stream().sorted().forEach(System.out::println);
//        new HashSet<>(fruits).forEach(System.out::println);
    }

    public static void findMinimumNumber() {
        List<Integer> numbers = Arrays.asList(9, 3, 7, 1, 5, -1);

        int min = numbers.stream().reduce(Integer::min).orElse(0);
        System.out.println(min);
    }

    public static void checkIfAllPositive() {
        List<Integer> values = Arrays.asList(3, 7, 9, 12);

        System.out.println(values.stream().allMatch(x -> x > 0));
    }

    public static void checkIfDivisibleBy5() {
        List<Integer> nums = Arrays.asList(11, 24, 30, 7);

        System.out.println(nums.stream().allMatch(x -> x % 5 == 0));
    }

    public static void countUniqueCharacter(){
        String input = "programming";

        int count = (int) input.chars().distinct().count();
        System.out.println(count);
    }

    public static void joinString(){
        List<String> cities = Arrays.asList("New York", "Paris", "Tokyo");

        System.out.println(cities.stream().collect(Collectors.joining(",")).toString());
    }

    public static void findStringLengths() {
        List<String> animals = Arrays.asList("dog", "elephant", "cat");

        System.out.println(Arrays.stream(animals.stream().map(String::length).toArray()).toList());
    }

    public static void getLastElementSafely() {
        List<String> items = Arrays.asList("a", "b", "c", "d");

        System.out.println(items.stream().skip(items.size()-1).findFirst().orElse(""));
    }

    public static void replaceNullWithDefault() {
        List<String> input = Arrays.asList("one", null, "three", null);

        System.out.println(Arrays.stream(input.stream().map(val -> val == null ? "UNKNOWN" : val).toArray()).toList());
    }


    public static void main(String[] args) {
        replaceNullWithDefault();
//        getLastElementSafely();
//        findStringLengths();
//        joinString();
//        countUniqueCharacter();
//        checkIfDivisibleBy5();
//        checkIfAllPositive();
//        findMinimumNumber();
//        convertListToMap();
//        removeDuplicate();
//        countAllNumbers();
//        filterEvenNumbers();
//        upperAllString();
//        countElements();
//        findFirstWordStartingWithA();

    }
}
