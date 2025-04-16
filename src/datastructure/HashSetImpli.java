package datastructure;

import java.util.HashSet;

public class HashSetImpli {



    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(3);
        if (hashSet.add(1)) {
            System.out.println("true");
        }else {
            System.out.println("false");

        }
        hashSet.stream().forEach(x -> System.out.println(x));
    }
}
