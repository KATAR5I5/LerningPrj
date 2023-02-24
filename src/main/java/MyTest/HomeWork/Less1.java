package MyTest.HomeWork;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Less1 {
    public static void main(String[] args) {
        String str = "fsakfsafsa3342##";
//        System.out.println(method(str));
//        System.out.println(method2(str));
//        System.out.println(m3(str));
        m6(str);
    }
//метод удаления повторяющихся символов
    static void m6(String str) {

        var map = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toCollection(LinkedHashSet::new))
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(map);

    }
//
    static void m5(String str) {
        Map<Character, Long> map = str.chars()
//                .peek(System.out::println)
                .mapToObj(c -> (char) c)
//                .peek(System.out::println)
                .collect(groupingBy(c -> c, LinkedHashMap::new, counting()));


        var result = map.entrySet().stream()
                .filter(e -> e.getValue() == 1)
//                .peek(System.out::println)
                .findFirst();
        System.out.println(result.orElse(null));

        for (int i = 0; i < str.length(); i++) {
            Character temp = str.charAt(i);
            if (map.containsKey(temp)) {
                if (map.get(temp) == 1) {
                    System.out.println(temp);
                    return;
                }
            }

        }
    }


    static Map<Character, Integer> method(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character temp = str.charAt(i);
            if (map.containsKey(temp)) {
                Integer integer = map.get(temp);
                integer++;
                map.put(temp, integer);

            } else map.put(temp, 1);
        }
        return map;
    }

    static Map<Character, Integer> method2(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character temp = str.charAt(i);
            map.compute(temp, (k, v) -> (v == null) ? 1 : ++v);
        }
        return map;
    }

    static Map<Character, Integer> m3(String str) {
        Map<Character, Integer> map = new HashMap<>();

        BiFunction<Character, Integer, Integer> bifun = (k, v) -> (v == null) ? 1 : ++v;
        for (int i = 0; i < str.length(); i++) {
            map.compute(str.charAt(i), bifun);
        }

        return map;

    }

    static void m4(String str) {
        Map<Character, Long> map = str.chars()
                .peek(System.out::println)
                .mapToObj(c -> (char) c)
                .peek(System.out::println)
                .collect(groupingBy(c -> c, counting()));
        System.out.println(map);
    }

}
