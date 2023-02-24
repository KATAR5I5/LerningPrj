package Streams;

import java.util.List;
import java.util.stream.Collectors;

public class DistinctEx {
//    возвращает стрим уникальных элементов
//    проверяет на уникальность по equals

    static List<Integer> integerList = List.of(5, 6, 4, 7, 5, 8, 9, 5, 34, 2, 7, 5, 8, 9);

    public static void main(String[] args) {
        List<Integer> res = integerList.stream()
                .peek(e->System.out.print(e+", "))
                .distinct()
                .collect(Collectors.toList());

        System.out.println("\n" + res);
    }
}
