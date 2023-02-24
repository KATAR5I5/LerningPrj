package Lymbda;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionEx {
    //    И принимает и возвращает
//    Function(T,R) - T -параметр, R - ReturnType
//    R apply(T, t);
    public static void main(String[] args) {
        List<String> listString = List.of("ok", "poke", "privet", "kak dela");
        Function<String, Integer> fun = el -> el.length();
//        Function<String, String> fun2 = el -> el.repeat(2);

        method(listString, fun);
//        method(listString, fun2);
    }

    static <T, V> void method(List<T> list, Function<T, V> function) {
               List<V> l = list.stream()
                        .map(function)
                        .collect(Collectors.toList());

        for (V e : l) {
            System.out.println(e);
        }
        System.out.println("-----------------------");
        for (T e : list) {
            System.out.println(e);
        }
        System.out.println("-----------------------");
    }
}
