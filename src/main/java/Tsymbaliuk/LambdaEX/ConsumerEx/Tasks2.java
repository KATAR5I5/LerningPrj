package Tsymbaliuk.LambdaEX.ConsumerEx;

import Tsymbaliuk.Data;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Tasks2 {
    static List<Integer> list = Data.integerList;

    public static void main(String[] args) {
//        task2Method1();
        task2Method2();
    }
    /*
    1)Реализуйте Consumer<Integer> с помощью которого выведите на экран все нечетные
    числа содержащиеся в List<Integer>.
    */

    static void task2Method1() {
        System.out.println(list);
        Consumer<Integer> consumer = e -> {
            if (e % 2 == 1) System.out.println(e);
        };
        list.stream().peek(consumer).collect(Collectors.toList());
        System.out.println("*********************");
        list.stream()
                .mapToInt(Integer::intValue) //проверил работает ли с примитивами
                .forEach(Tasks2::cons1);
    }

    static <T> void cons1(T value) {
        if (value instanceof Integer)
            if ((int) value % 2 == 1)
                System.out.println(value);
    }

    /*
    2)Реализуете Consumer<String> с побочным эффектом в виде занесения всех строк
содержащих цифры во вспомогательный список.
     */
    static void task2Method2() {
        System.out.println(Data.listStrings);
        List<String> result = new ArrayList<>();
        Consumer<String> consumer = s -> {
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) return;
            }
            result.add(s);
        };

        Data.listStrings.stream().forEach(consumer);
        System.out.println(result);

    }

    /*
    3) Реализуйте BiConsumer<String, File> добавляющий строку в конец файла указанного в
    качестве параметра.
    */
    BiConsumer<String, File> biConsumer = (addingString, file) -> {
        String targetName = file.getName() + addingString;
        try {
            Files.move(file.toPath(), file.toPath().resolveSibling(targetName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    };
}
