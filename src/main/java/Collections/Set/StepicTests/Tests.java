package Collections.Set.StepicTests;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tests {

    public static void main(String[] args) {
        String[] strings = {"1 2 3 4 5", "6 7 8 9 10", "11 12 13 14 15"};
        String strings2 = "1 26 12 1 7 8 9 10 11 3 4 5 3 14 51";
        Arrays.asList(strings2.split(" ")).stream()
                .map(Integer::valueOf)
                .filter(e -> e % 2 != 0)
                .collect(Collectors.toCollection(TreeSet::new))
                .stream()
                .forEach(System.out::println);


    }

    static TreeSet<Integer> unionTreeLargeNumber(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3) {
        TreeSet<Integer> resultSet = new TreeSet<>();
        resultSet.add(Collections.max(set1));
        resultSet.add(Collections.max(set2));
        resultSet.add(Collections.max(set3));
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.forEach(System.out::println);
        lhs.contains(10);
        lhs.add(new Object());

        return resultSet;
    }

}
