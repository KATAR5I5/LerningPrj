package Tsymbaliuk.Streems;

import Tsymbaliuk.Data;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test_6_Collect {
    public static void main(String[] args) {
//        task6Method4();
        nonNumInString(Data.listStrings);
    }

    /*
    1) Используя Collector напишите свою реализацию метода Collectors.toSet()
    */
    static void task6Method3() {
        List<Integer> list = Data.integerList;
        Set <Integer> s=list.stream()
                .collect(HashSet::new, (set, el) -> set.add(el), (set1, set2) -> set1.addAll(set2));

    }

    /*
    2) Используя Collector соберите в карту, только те слова в потоке строк, в которых есть гласные.
    */

    static void task6Method4() {
        List<String> nl = new ArrayList<>();
        List<String> list = Data.listStrings;
        Predicate<String> predicate = e -> {
//            реализация
            nl.add(String.valueOf(e.charAt(0)));
            return true;
        };

        var result = list.stream()
                .filter(predicate)
                .collect(Test_6_Collect::getMap, Test_6_Collect::putMap, (a, b) -> a.putAll(b));
        System.out.println(result);
        System.out.println(nl);
    }

    static Map<String, List<String>> getMap() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("NoNum", new ArrayList<String>());
        return map;
    }

    static void putMap(Map<String, List<String>> m, String s) {
        m.get("NoNum").add(s);
    }

    static void nonNumInString(List<String> list) {
        System.out.println(list);
//        Function<String,Boolean> = s->s.chars()
//                .mapToObj(ch -> (char) ch)
//                .noneMatch(Character::isDigit);
//        var result = list.stream()
//                .filter(s -> {
//                    return s.chars()
//                            .mapToObj(ch -> (char) ch)
//                            .noneMatch(Character::isDigit);
//                })
//                .collect(Collectors.groupingBy());
//        System.out.println(result);
    }


}
