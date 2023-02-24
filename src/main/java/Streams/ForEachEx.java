package Streams;

import java.util.List;

public class ForEachEx {

    static List<Integer> integerList = List.of(5, 6, 4, 5, 7, 8, 9, 5, 34, 2);
    static List<String> stringsList = List.of("5", "6", "4", "5", "7", "8", "9", "5", "34", "2");
    static List<?> objectList = List.of(5, "cnhjrf", 4, 5, "dsfgfd", 8, "dsfgds", 5, "hjk", 2);


    public static void main(String[] args) {
        integerList.stream().forEach(Utils::method2);
        System.out.println("\n-----------------------");
        stringsList.stream().forEach(Utils::methodPrint);
        System.out.println("\n-----------------------");
        objectList.stream()
                .filter(el -> el instanceof Integer)
                .forEach(Utils::methodPrint);
    }
}

class Utils<T> {
    static <T> void methodPrint(T value) {
        System.out.print(value + ", ");
    }

    static <T> void method2(T value) {
        if (value instanceof Integer) {
            System.out.print((Integer) value * 2 + " ");

        }
    }
}
