package MyTest.HomeWork.Task1_3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UtilsForFruits<T> {
    //3.0
    static <T> void sorting(T[] arr, Comparator<? super T> c) {
        Stream.of(arr)
                .sorted(c)
                .forEach(System.out::println);
        System.out.println("---------------------------");
    }

    //3.1
    static <T> int findIndexOfElementObject(T[] arr, T toFind, Comparator<? super T> c) {

//        Stream.of(arr)
//                .filter(e -> e.equals(toFind))
//                .findFirst().get();

//        Если есть equals & hashCode
        List<T> list = Arrays.asList(arr);
        Optional<Integer> index = Optional.ofNullable(list.indexOf(toFind));
        if (index.isPresent()) {
            return index.get();
        }
        return -1;
    }

    //3.2
    public static Optional<Fruit> findForWeight(Fruit[] arr, TypeFound typeFound) {
        if (arr.length == 1) return Optional.ofNullable(arr[0]);

        if (typeFound == TypeFound.MAX)
            return Stream.of(arr)
                    .max((o1, o2) -> Integer.compare(o1.getWeight(), o2.getWeight()));

        if (typeFound == TypeFound.MIN)
            return Arrays.asList(arr).stream()
                    .min((o1, o2) -> o1.getWeight() - o2.getWeight());

        if (typeFound == TypeFound.AVERAGE) {
            double average = Stream.of(arr)
                    .mapToInt(e -> e.getWeight())
                    .average()
                    .getAsDouble();
            return Stream.of(arr)
                    .filter(e -> e.getWeight() < average)
                    .findFirst();
        }

//        var find2 = switch (typeFound) {
//            case MAX -> Stream.of(arr)
//                    .max((o1, o2) -> Integer.compare(o1.getWeight(), o2.getWeight()));
//
//            case MIN -> Arrays.asList(arr).stream()
//                    .min((o1, o2) -> o1.getWeight() - o2.getWeight());
//
//            case AVERAGE -> Stream.of(arr)
//                    .filter(e -> {
//
//                    })
//                    .mapToInt(e -> e.getWeight())
//                    .reduce((a, e) -> (a + e / 2))
//                    .
//                    .findFirst();
//        };
        return Optional.ofNullable(null);
    }

//3.3
//    static Set<Map.Entry<Integer, Melon>> sravnit(Map<Fruit,>)



}

enum TypeFound {
    MIN, MAX, AVERAGE;
}
