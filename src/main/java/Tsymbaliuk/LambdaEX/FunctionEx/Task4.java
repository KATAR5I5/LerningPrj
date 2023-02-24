package Tsymbaliuk.LambdaEX.FunctionEx;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        Integer[] integers = {5, 6, 7, 8, 9, 10};
//        task4Method1(integers);
//        task4Method2("Опишите integers такую");
        task4Method3("Опишите integers такую","Опишите integrs таку");
    }

    /*
    1) С помощью реализации Function<Integer[],Integer> и реализации Predicate<Integer>
    реализуйте функцию которая вернет количество простых
    чисел в массиве целых чисел. Например [5,6,7,8,9,10] => 2
    */
    static void task4Method1(Integer[] ints) {
        Predicate<Integer> predicate = e -> {
            for (int i = 2; i < e; i++) {
                if (e % i == 0) return false;
            }
            return true;
        };
        Function<Integer[], Integer> function = e -> {
            Long result = Arrays.asList(e).stream()
                    .filter(predicate)
                    .count();
            return (int) ((long) result);
        };
        System.out.println(function.apply(ints));
    }

    /*
    2) Опишите такую реализацию Function<String, Integer> которая вернет
    количество согласных букв в строке текста.
     */
    static void task4Method2(String str) {
        Predicate<Integer> predicate = e -> {
            return e < 1104 && e > 1039 ? true : false;

        };

        Function<String, Integer> function = s -> {
            Long count = s.chars()

                    .mapToObj(e -> (Integer) e)
                    .filter(predicate)
                    .count();
            System.out.println(count);
            return (int) (long) count;
        };
        function.apply(str);

    }

    /*
    4) Опишите такую реализацию BiFunction<String,String,String[]> которая вернет в виде массива
слова которые одновременно присутствуют и в первой строке и во второй (слова разделены
пробелами). Например text1 = «Hello Java», text2 = «Hello Python» в результате должен быть
массив вида [«Hello»].
    */
    static void task4Method3(String str1, String str2) {
        BiFunction<String, String, String[]> biFunction = Task4::apply;
        System.out.println(Arrays.toString( biFunction.apply(str1,str2)));


    }

    static String[] apply(String s1, String s2) {
        List<String> result = Arrays.asList(s1.split(" ")).stream()
                .filter(e -> s2.contains(e))
                .collect(Collectors.toList());
        return result.toArray(new String[0]);
    }

}
