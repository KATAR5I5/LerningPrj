package Tsymbaliuk.LambdaEX.PredicateEx;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
//        task1Method1(Data.listStrings);
//        task1Method2(Data.listStrings);
//        task1Method3();
//        task1Method4();
        task1Method5();

    }

    /*
    1) С помощью реализации Predicat<String> реализуйте удаление со списка строк начинающихся с
    определенной буквы. Например удалить все строки которые начинаются на букву y.
    */
    static void task1Method1(List<String> strList) {
        ArrayList<String> l = new ArrayList<>(strList);
        Predicate<String> predicate = e -> !e.startsWith("y");
        strList.stream()
                .filter(predicate)
//                .peek(System.out::println)
                .collect(Collectors.toList());


        l.removeIf(predicate);
        System.out.println(l);

    }

    /*
      2) Используя реализацию Predicate<String> реализуйте удаление со списка строк, строки первая
      буква которых задается отдельным массивом символов. Например если этот массив содержит
      ['h','a','t'] то со списка стоит удалить все строки которые начинаются с этих букв.
     */
    static void task1Method2(List<String> strList) {
        Predicate<String> predicate = e -> {
            Character[] ch = {'h', 'a', 't'};
            return !Arrays.asList(ch).contains(e.charAt(0));
        };
        strList.stream()
                .filter(predicate)
                .peek(System.out::println)
                .collect(Collectors.toList());

    }
    /*
     3) Используя реализацию Preticate<Cat> (в качестве Cat взять класс используемый в лекции) и
      методы для логических функций, реализуйте удаление из списка Cat котов возраст которых
     меньше определенного значения (задается как параметр), а имя по алфавиту идет после буквы
     (задается так же как параметр). Например если первый параметр задан как 5, а второй как 'C' то
     будет удален Cat [name=Timka, age=4], Cat [name=Kuzia, age=2].
     */

    static void task1Method3() {
        List<Cat> catList = getListCat();
        System.out.println(catList);
        char ch = 'C';
        Predicate<Cat> predicate = cat -> cat.getAge() < 5;
        Predicate<Cat> predicate3 = cat -> cat.getName().charAt(0) == ch;


        Predicate<Cat> predicate2 = cat -> cat.getAge() >= 8;
//        catList.stream().filter(predicate2).forEach(System.out::println);
        catList.removeIf(predicate.or(predicate3));
        System.out.println(catList);

    }

    static List<Cat> getListCat() {
        Cat cat1 = new Cat("Umka", 12);
        Cat cat2 = new Cat("Luska", 5);
        Cat cat3 = new Cat("Barsic", 8);
        Cat cat4 = new Cat("Timka", 4);
        Cat cat5 = new Cat("Kuzia", 2);
        List<Cat> cats = new ArrayList<>(List.of(cat1, cat2, cat3, cat4, cat5));
        return cats;
    }


    /*
     4) Используя реализацию BiPredicate<Integer, String> реализуйте удаление из Map<Integer, String>
всех пар ключ-значение для которых длинна строки значения не равна ключу этого значения.
Например такая пара как {3: «Hello»} должна быть удалена так как длинна «Hello» не равна 3, а
пара вида {4: «Java»} останется.*/
    static void task1Method4() {
        Map<Integer, String> map = getMapIS();
        System.out.println(map);

        BiPredicate<Integer, String> predicate = (i, s) -> i == s.length();

        map.entrySet().stream()
                .filter(e -> predicate.test(e.getKey(), e.getValue()))
                .forEach(System.out::println);

        map.entrySet().removeIf(e -> predicate.test(e.getKey(), e.getValue()));
        System.out.println(map);

    }

    static Map<Integer, String> getMapIS() {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "o");
        map.put(2, "oo");
        map.put(3, "o");
        map.put(4, "oooo");
        map.put(5, "oooo");

        return map;
    }

    /*
    5) Создайте такую реализацию IntPredicate которая будет возвращать true в случае когда сумма
цифр числа число четное. Например для 103 — вернет true, так 1+0+3 = 4.
    */
    static void task1Method5() {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(103, 220, 53, 14, 225, 226, 227, 228, 339, 30));
        System.out.println(integerList);

        IntPredicate ip = e -> {
            int temp = e;
            int sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp = temp / 10;
            }
            return sum % 2 == 0;
        };
        IntPredicate ip2 = Task1::test2;

        integerList.stream()
                .mapToInt(Integer::intValue)
                .filter(Task1::test2)
                .forEach(System.out::println);
        integerList.removeIf(Task1::test2);
        System.out.println(integerList);
    }
    static boolean test2(int e){
        int temp = e;
        int sum = 0;
        while (temp > 0) {
            sum += temp % 10;
            temp = temp / 10;
        }
        return sum % 2 == 0;
    }
}



