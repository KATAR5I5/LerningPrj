package Collections.List.Find;

import java.util.Comparator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//нужно найти максимальный элемент в коллекции.
public class MaxInCollection {
    static List<Integer> intList = List.of(
            376, 847, 271, 663, 47, 3, 879, 376, 133, 693, 13, 382, 879
    );

    public static void main(String[] args) {
        method1(intList);
        method2(intList);
        method3(intList);
        method4(intList);
        method5(intList);
        method6(intList);
        method7(intList);
        method8(intList);
        method9(intList);
    }

    static void method1(List<Integer> list) {
        Integer max = list.stream()
                .max(Integer::compareTo)
                .get();
        System.out.println(max);
    }

    static void method2(List<Integer> list) {
        Integer max = list.stream()
                .sorted((e1, e2) -> (Integer.compare(e2, e1)))
                .findFirst()
                .get();
        System.out.println(max);
    }

    static void method3(List<Integer> list) {
        Integer max = Collections.max(list);
        System.out.println(max);
    }

    static void method4(List<Integer> list) {
        Integer max = list.stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();
        System.out.println(max);
    }

    static void method5(List<Integer> list) {
        Integer max = list.stream()
                .max(Comparator.naturalOrder())
                .orElse(null);
        System.out.println(max);
    }

    static void method6(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        Integer max = it.next();

        while (it.hasNext()) {
            Integer current = it.next();
            if (current.compareTo(max) > 0) {
                max = current;
            }
        }
        System.out.println(max);
    }

    static void method7(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (Integer i : list) {
            max = Integer.max(max, i);
        }
        System.out.println(max);
    }

    static void method8(List<Integer> list) {
        Integer max = Integer.MIN_VALUE;
        for (Integer x : list.toArray(new Integer[0])) {
            if (Integer.valueOf(max).compareTo(Integer.valueOf(x)) < 0) {
                max = x;
            }
        }
        System.out.println(max);

    }

    static void method9(List<Integer> list) {
        Integer max = list.stream()
                .mapToInt(Integer::new)
                .max()
                .getAsInt();
        System.out.println(max);
    }
}
