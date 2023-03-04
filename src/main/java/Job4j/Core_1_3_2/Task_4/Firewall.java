package Job4j.Core_1_3_2.Task_4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {

        Set<String> ststja = new HashSet<>(Arrays.asList(s.split(" ")));
//        if (!ststja.containsAll(words)) return "Вы сделали правильный выбор!";
        var res = ststja.stream()
                .filter(words::contains)
                .findFirst().isEmpty();
        if (res) {
            return "Вы сделали правильный выбор!";
        } else return "Выберите другую статью...";
    }
}
