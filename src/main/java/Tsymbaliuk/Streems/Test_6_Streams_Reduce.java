package Tsymbaliuk.Streems;

import Tsymbaliuk.Data;

import java.util.List;
import java.util.function.BinaryOperator;

public class Test_6_Streams_Reduce {
    public static void main(String[] args) {
//        task6Method1();
//        task6Method2();
        task6Method3();
    }


    /*
    1) Разбейте строку английского текста по символу пробел. Используя reduce верните суммарное
количество букв в словах длинна которых превышает 4.
     */
    static void task6Method1() {
        List<String> list = Data.listStrings;
        System.out.println(list);
        var result = list.stream()
                .filter(s -> s.length() < 3)
//                .peek(System.out::println)
                .mapToInt(String::length)
                .reduce(0, (s1, s2) -> (s1 + s2));
        System.out.println(result);
    }

    /*
    2) Используя reduce верните произведение элементов потока полученных на основании списка целых
чисел.
    */
    static void task6Method2() {
        List<Integer> list = Data.integerList;
        System.out.println(list);
        var result = list.stream()
                .limit(2)
                .reduce((a, b) -> a * b);
        System.out.println(result.orElseGet(() -> 0));
    }

    /*
    3) Замените с помощью метода reduce терминальный метод max
    */
    static void task6Method3() {
        List<Integer> list = Data.integerList;
        System.out.println(list);
        BinaryOperator<Integer> bi = (a, b) -> (a < b) ? b : a;
        var res = list.stream()
                .reduce(bi).get();
        System.out.println(res);
    }

}
