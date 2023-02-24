package MyTest.HomeWork;

import java.util.Arrays;

public class Task1_2 {
    static final String string = "fsa784443jj kfsaf sa33s s42eeq aqq##";

    public static void main(String[] args) {
        sortingString(string);
        System.out.println("------------------------");
        sortingStringRevers(string);
    }

    static void sortingString(String str) {
        Arrays.asList(str.split(" ")).stream()
                .sorted((e1, e2) -> Integer.compare(e1.length(), e2.length()))
                .forEach(System.out::println);
    }
    static void sortingStringRevers(String str) {
        Arrays.asList(str.split(" ")).stream()
                .sorted((e1, e2) -> Integer.compare(e2.length(), e1.length()))
                .forEach(System.out::println);
    }

}
