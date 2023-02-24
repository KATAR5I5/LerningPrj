package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedEX {
    static List<Integer> integerList = java.util.List.of(5, 8, 2, 4, 3);
    static List<String> stringsList = java.util.List.of("Иван", "Ян", "Боб", "Андрей", "Антон", "Алексей");
    static List<Integer> notElement = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(stringsList);
        System.out.println("\n---------------------");
//  Sort by Default String
        System.out.println("Sort by Default String");
        List<String> sortListDefault = stringsList.stream()
                .sorted()
                .peek(el-> System.out.print(el + ", "))
                .collect(Collectors.toList());
        System.out.println("\n---------------------");

// Sort by length String (by Comparator)
        System.out.println("Sort by length String (by Comparator)");
        List<String> sortListComparator = stringsList.stream()
                .sorted((x, y) -> Integer.compare(x.length(), y.length()))
                .peek(el-> System.out.print(el + ", "))
                .collect(Collectors.toList());
        System.out.println("\n---------------------");


//  Integer by Comparator == Revers Default Integer
        System.out.println("Integer by Comparator == Revers Default Integer");
        List<Integer> intListCom1 = integerList.stream()
                .sorted((o1, o2) -> Integer.compare(o1,o2))
                .peek(el-> System.out.print(el + ", "))
                .sorted((o1, o2) -> o2 - o1)
                .peek(el-> System.out.print("-"))
                .peek(el-> System.out.print(el + ", "))
                .collect(Collectors.toList());
        System.out.println("\n---------------------");

//  Integer by Comparator == Default Integer
        System.out.println("Integer sort == Default Integer");
        List<Integer> intListComp2 = integerList.stream()
//                .sorted((o1, o2) -> Integer.compare(o1, o2))
                .peek(el-> System.out.print(el + ", "))
                .collect(Collectors.toList());
        System.out.println("\n---------------------");

        String str = TestClass.str;
    }
}
