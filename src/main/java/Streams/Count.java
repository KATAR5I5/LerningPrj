package Streams;

import java.util.stream.Stream;

public class Count {
//        Стрим после обработки нельзя переиспользовать!
//    stream has already been operated upon or closed
    public static void main(String[] args) {
        Stream<Integer> streamInt = Stream.of(2, 3, 4, 65, 67, 78, 8, 9, 67, 5);

        System.out.println(streamInt.count());
//        Строка ниже вызовет Exeption, тк пытаемся переиспользовать либо строка 10 либо 12
        System.out.println(streamInt.distinct().count());
    }
}
