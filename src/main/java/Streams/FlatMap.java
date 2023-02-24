package Streams;

import java.util.List;

public class FlatMap {
    //    работаем с элементами элементов
    static List<Integer> integerList1 = List.of(5, 6, 4);
    static List<Integer> integerList2 = List.of(7, 5, 8 );
    static List<Integer> integerList3 = List.of(9, 10, 11);

    public static void main(String[] args) {
        List<List<Integer>> listIntLists = List.of(integerList1, integerList2, integerList3);
        listIntLists.stream()
                .flatMap(el -> el.stream()
//                        .map(e -> e + 5)
//                        .filter(e -> e < 12)
//                        .peek(e -> System.out.print(e + ", "))
                )
                .forEach(System.out::println);
    }
}
