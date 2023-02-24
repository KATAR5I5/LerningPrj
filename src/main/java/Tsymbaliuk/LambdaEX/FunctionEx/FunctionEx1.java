package Tsymbaliuk.LambdaEX.FunctionEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionEx1 {
    public static void main(String... args) {
        List<String> stringList = Arrays.asList("11 2 4445 666 72342 77".split(" "));
        Function<String, Integer> fun = String::length;
//        List<Integer> result = getList2(stringList, fun);

        List<Integer> integerList = stringList.stream()
                .map(String::length)
                .collect(Collectors.toList());


    }

    static List<Integer> getList(List<String> listStr, Function<String, Integer> fun) {
        List<Integer> integerList = listStr.stream()
                .map(e -> fun.apply(e))
                .peek(System.out::println)
                .collect(Collectors.toList());
        return integerList;
    }

    static <R, T> List<R> getList2(List<T> list, Function<T, R> fun) {
        List<R> result = list.stream()
                .map(e -> fun.apply(e))
                .peek(System.out::println)
                .collect(Collectors.toList());
        return result;
    }


}