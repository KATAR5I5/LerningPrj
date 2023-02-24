package Collections.List.Find;

import java.util.*;
import java.util.stream.Collectors;

public class LinkedListQuest {
    static String str = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20";

    public static void main(String[] args) {
//        method1();
        method2();
    }

    static void method1() {
        List<Integer> ll = new LinkedList<>();
        Arrays.stream(str.split(" "))
                .map(Integer::valueOf)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toCollection(LinkedList::new))
                .stream()
                .skip(3)
                .forEach(System.out::println);

    }

    static void method2() {

        Deque<String> stack = new LinkedList<>();
        Arrays.stream(str.split(" "))
                .collect(Collectors.toCollection(LinkedList::new))
//                .forEach(x -> stack.push(x));

                .stream()
                .skip(3)
                .sorted(Comparator.comparing(Integer::parseInt))
                .forEach(System.out::println);
    }
}
