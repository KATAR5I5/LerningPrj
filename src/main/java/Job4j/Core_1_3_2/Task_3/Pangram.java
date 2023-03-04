package Job4j.Core_1_3_2.Task_3;

import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Pangram {
    public static void main(String[] args) {
        String s = "Jackdaws love my big sphinx of quartz";
        System.out.println(checkString(s));
    }

    public static boolean checkString(String s) {
        IntPredicate predicate = integer -> integer <= 90 && integer >= 65 || integer <= 122 && integer >= 97;
        var enAlphabet = IntStream.range(97, 123)
                .mapToObj(el -> String.valueOf((char) el))
                .collect(Collectors.toSet());
        System.out.println(enAlphabet);

        Predicate<String> charInCollection = enAlphabet::contains;
//        System.out.println(enAlphabet);

        s.chars()
                .filter(predicate)
                .mapToObj(num -> String.valueOf((char) num))
                .map(String::toLowerCase)
                .filter(charInCollection)
                .forEach(enAlphabet::remove);

        System.out.println(enAlphabet);
        return enAlphabet.isEmpty();
    }
}
