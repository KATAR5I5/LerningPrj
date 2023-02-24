package MyTest.HomeWork;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1_1 {
    static String str = "fsakfsaf sa33ss42eeqaqqqq## dfg d ghhh";

    static String str2 = "<dependency>\n" +
            "<groupId>junit</groupId>\n" +
            "<artifactId>junit</artifactId>\n" +
            "<version>4.4</version>\n" +
            "<scope>test</scope>\n" +
            "</dependency>\n" +
            "<dependency>\n" +
            "<groupId>org.powermock</groupId>\n" +
            "<artifactId>powermock-reflect</artifactId>\n" +
            "<version>3.2</version>\n" +
            "</dependency>";

    public static void main(String[] args) {
//        m2(str);
//        m3(str2);
        m4(str2);
    }

    void method1() {
        Map<Character, Integer> mapChar = new LinkedHashMap<>();

        var result = str.chars()
                .mapToObj(c -> (char) c)
//                .peek(e->mapChar.compute(e,(k, v) ->(v == null) ? 1 : ++v))
                .collect(Collectors.groupingBy(el -> el, Collectors.counting()));
        System.out.println(result);

        var r = result.entrySet()
                .stream()
                .max((e1, e2) -> Long.compare(e1.getValue(), e2.getValue()))
                .stream()
                .map(e -> e.getKey())
                .peek(System.out::println)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        System.out.println(r);
    }

    static void m2(String str) {

        String result = Stream.of(str.split(" "))
                .filter(e -> e.length() > 5)
                .map(e -> (e + " "))
                .collect(Collectors.joining());
        System.out.println(result);
        System.out.println(result.length());

        String result2 = Stream.of(str.split(" "))
                .filter(e -> e.length() > 5)
                .reduce((a, e) -> (a + " " + e)).get();
        System.out.println(result2);
        System.out.println(result2.length());



    }

    static void m3(String str) {
        String[] strings = str.split("\n");
        var list = Stream.of(strings)
                .filter(e -> e.startsWith("<groupId>"))
                .map(e -> e.substring(e.indexOf(">") + 1))
                .map(e -> e.substring(0, e.indexOf("<")))
                .collect(Collectors.toList());
        System.out.println(Arrays.toString(strings));
        System.out.println(list);
    }
    static void m4(String str) {
        String[] strings = str.split("\n");
        var list = Stream.of(strings)
                .flatMapToInt(e->e.chars())
                .peek(System.out::println)
//                .forEach(System.out::print);
                .dropWhile(value -> value!=62)
                .takeWhile(value -> value!=60)
                .mapToObj(e->(char)e)
                .collect(Collectors.toList());
        System.out.println(Arrays.toString(strings));
        System.out.println(list);
    }
}
