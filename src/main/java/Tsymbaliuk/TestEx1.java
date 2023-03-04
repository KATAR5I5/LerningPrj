package Tsymbaliuk;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestEx1 {
    public static void main(String[] args) {
        List<Integer> list = Data.integerList;
        List<String> stringList = Data.listStrings;
        String s = stringList.stream()
                .collect(Collectors.joining());

//        m1(s);
//        m2(list);
//        m4();
//        m5();
        m7();


    }

    static void m1(String s) {
        Function<Character, String> funCharToString = c -> {
            if (c > 48 && c < 59)
                return "Цифры";
            else if (c < 48) return "Знаки";
            if (c > 1000 && c < 1300) {
                return "Russian";
            }
            return "English ";
        };
        Map<String, List<Character>> res = s.chars()
//                .peek(System.out::println)
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(funCharToString));
        res.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
        });
//        System.out.println(res);

    }

    static void m2(List<Integer> integerList) {
        BiConsumer<HashMap<String, List<Integer>>, Integer> accumulator =
                (hm, i) -> {
                    hm.put("chet", new ArrayList<>());
                    hm.put("neChet", new ArrayList<>());
                    if (i % 2 == 0) {
                        hm.get("chet").add(i);
                    } else hm.get("neChet").add(i);
                };
        var res = integerList.stream()
                .collect(Collectors.groupingBy(i -> i % 2 == 0 ? "chet" : "neChet"));
        System.out.println(res);
    }

    static void m3() {
        var r = IntStream.range(1, 200)
                .mapToObj(i -> (Integer) i)
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(r));

        Function<Integer, String> fun = elInt -> {
            String temp = String.valueOf(elInt);
            return switch (temp.length()) {
                case 3 -> "Трехзначное";
                case 2 -> "Двухзначное";
                case 1 -> "Одинарное";
                default -> "Иное";
            };

        };
        var res = Arrays.stream(r).
                collect(Collectors.groupingBy(fun));
        res.forEach((k, v) -> {

            System.out.println(k);
            System.out.println(v);
        });


    }

    static void m4() {
        String s = "ssssdfsdfsdfgdhfghjfhjfgaam";
        System.out.println(s);
        var res = s.codePoints()
                .mapToObj(i -> (char) i)
                .collect(Collectors.toMap(Function.identity(), el -> 1, (a, b) -> a + b));
//        System.out.println(res);
//                .peek(System.out::println)

        var array = s.split("");
        Map<String, Integer> result = new LinkedHashMap<>();
        var cnt = Arrays.stream(array)
                .peek(el -> {
                    if (result.containsKey(el)) {
                        result.put(el, result.get(el) + 1);
                    } else result.put(el, 1);
                })
                .collect(Collectors.joining());
        System.out.println(result);

        Map<String, Integer> result2 = new LinkedHashMap<>();
        var cnt2 = Arrays.stream(array)
                .peek(el -> result2.compute(el, (k, v) -> v == null ? 1 : ++v))
                .collect(Collectors.joining());
        System.out.println(result2);

    }

    static void m5() {
        String s = "ssssdfsdfsdfgdhfghjfhjfgaam";

        var res = s.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new,
                        Collectors.groupingBy((ch -> {
                            Integer i = (int) ch;
                            return i;
                        }), Collectors.counting())));
        res.forEach(
                (k, v) ->
                        System.out.println(k + "\n\t Unicode = count \n\t" + v));
//        System.out.println(res);
    }

    static void m6() {
        List<Integer> integerList = Data.integerList;
        var res = integerList.stream()
                .collect(Collectors.maxBy(Integer::compareTo));
//                .entrySet().stream()
//                .sorted((entry1,entry2)->Integer.compare(entry2.getKey(), entry1.getKey()))
//                .findFirst();

        System.out.println(res);
//        if(res.isPresent()){
//            System.out.println(
//        "number - " + res.get().getKey() + "\ncount - "+ res.get().getValue()
//
//
//            );
//        }else System.out.println("not");
    }

    static void m7() {
        String s = Data.string;
        System.out.println(s);
        BiConsumer<Set<String>, String> accumulator = (l, e) -> {
            l.add(e);
        };

        BiConsumer<Set<String>, Set<String>> combiner = (l1, l2) -> {
            l1.addAll(l2);


        };
        Supplier<Set<String>> supplier = HashSet::new;

        var r = s.chars()
                .parallel()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(supplier, accumulator, combiner)
                .stream().sorted().collect(Collectors.toList());
        System.out.println(r);

    }
}



