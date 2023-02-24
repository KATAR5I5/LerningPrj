package Streams;

import java.util.Arrays;
import java.util.List;

public class TestClass {
    public static final String str = "hi";
    public static void main(String[] args) {

        var collection = Arrays.asList(1,2,3);
        collection.add(1);
        var list1 = List.of(collection);
        collection.add(2);
        var list2 = List.copyOf(collection);
        System.out.println(list1);
        System.out.println(list2);
    }
}
