package Tsymbaliuk.LambdaEX.Supplier;

import Tsymbaliuk.Data;

import java.util.List;
import java.util.function.Supplier;

public class Task3 {
    public static void main(String[] args) {
        task3Method1();
//        task3Method2();
//        task3Method3();
    }
    /*
    1) Реализуйте с помощью класса Supplier<String> который будет при каждом вызове get()
возвращать слово полученное из строки переданной в качестве параметра конструктору этого
класса. Для упрощения задания выполните разбиение строки по символу пробел.
     */

    static void task3Method1() {
        List<String> list = Data.listStrings;
        for(String el: list){
        Supplier<String> supplier = new SupplierString(el);
            System.out.println(supplier.get());
        }

    }

    /*
    2) Реализуйте Supplier<String> с помощью Predicate<String> реализующий следующий функционал:
возвращать из List<String> только строки соответствующие реализации Predicate. Например если
у вас есть список [«Hello», «world», «Java»], а Predicate возвращает true только если слово
начинается с большой буквы, ваша реализация Supplier должна последовательно вернуть
«Hello», «Java» и после чего возвращать null (закончились подходящие значения).
*/
    static void task3Method2() {
        List<String> list = Data.listStrings;
        System.out.println(list);
        list.stream()
                .filter(s -> {
                    String ch = String.valueOf(s.charAt(0)).toUpperCase();
                    return ch.equals(String.valueOf(s.charAt(0))) && !Character.isDigit(s.charAt(0)) ? true : false;
                })
                .forEach(System.out::println);

    }
    /*
    Реализуйте IntSupplier последовательно возвращающий элемент из массива целых чисел.
     */

    static void task3Method3() {
        List<Integer> list = Data.integerList;
//        IntSupplier i = ()->Integer::intValue;
        list.stream()
                .mapToInt(Integer::intValue)
//                .peek(e-> System.out.println())
                .forEach(System.out::println);
    }

}

class SupplierString implements Supplier<String> {
    String string;

    public SupplierString(String string) {
        this.string = string;
    }

    @Override
    public String get() {
        return string;
    }
}



