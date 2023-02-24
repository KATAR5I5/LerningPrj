package Streams;

import java.util.List;
import java.util.stream.Collectors;

public class Chaining {
//    Стрим после обработки нельзя переиспользовать!
    static List<Integer> integerList = List.of(5, 6, 4, 7, 8, 9, 34, 2);

    public static void main(String[] args) {
//
               int a =  integerList.stream()
                        .filter(el -> el % 2 != 0)
                        .map(el -> {
                            if (el % 3 == 0) {
                                el = el / 3;
                            }
                            return el;
                        })
                       .peek(System.out::println)
                        .reduce((accum, el) -> accum + el)

                       .orElse(0);
               print(a) ;
    }

    static <T> void print(T val) {
        System.out.println(val);
    }
}
