package Collections.List.Find;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//найти самую длинную строку в списке и заменить все значения на длинного
public class FindLongString {
    static List<String> stringList = Arrays.asList("hi hello goodmorning goodmorning goodmorning ass".split("\\s"));

    public static void main(String[] args) {
        method1(stringList);
        method2(stringList);
    }

    static void method1(List<String> list) {
        String maxLength = list.stream()
                .max((s1, s2) -> (Integer.compare(s1.length(), s2.length())))
                .orElse(null);
//                .get();
        Collections.fill(list, maxLength);
    }

    static void method2(List<String> list) {
        if (!list.isEmpty()) {
            String max = Collections.max(list, (s1, s2) -> s1.length() - s2.length());
            list.replaceAll(s -> max);
        }
    }

    static void method3(List<String> list) {
        List<String> res = Collections.nCopies(list.size(), Collections.max(list, Comparator.comparingInt(String::length)));
        System.out.println(res);
    }

    static void method4(List<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() > o2.length() ? 1
                        : o1.length() < o2.length() ? -1 : 0;
            }
        });
        for (String value : list) {
            list.set(list.indexOf(value), list.get(list.size()-1));
        }
    }
}
