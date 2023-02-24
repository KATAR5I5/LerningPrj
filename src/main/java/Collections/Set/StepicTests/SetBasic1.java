package Collections.Set.StepicTests;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetBasic1 {
    static String str = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20";
    static String str2 = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20";
    static String[] strings;

    static {
        strings = str.split(" ");

    }

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> helpList = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        set = Arrays.stream(strings)
                .map(Integer::valueOf)
                .collect(Collectors.toSet());

        helpList.stream()
                .peek(set::add)
                .collect(Collectors.toList());

        set = removeAllNumbersMoreThan10(set);
        set.forEach(System.out::println);
    }

    public static Set<Integer> removeAllNumbersMoreThan10(Set<Integer> set) {
        set.removeIf(e -> e > 10);
        return set;
    }

    public static Set<Integer> symDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> retain = new HashSet<>(set1);
        retain.retainAll(set2);
        set1.addAll(set2);
        set1.removeAll(retain);
        return         Stream.concat(set1.stream(),set2.stream())
                .filter(e->!(set1.contains(e) && set2.contains(e)))
                .collect(Collectors.toSet());
    }
}
