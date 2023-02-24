package Streams;

import java.util.stream.Stream;

public class CreateStreams {
    public static void main(String[] args) {
//    Можно создать стрим из элементов
//            Стрим после обработки нельзя переиспользовать!
        Stream<Integer> streamInt = Stream.of(2, 3, 4, 65, 67, 78, 8, 9, 67, 5);
        streamInt.forEach(System.out::println);

//    Можно создать стрим из Collections

    }
}
