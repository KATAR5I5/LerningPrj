package Job4j.Core_1_3_2.Task_6;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Isogram {
    public static void main(String[] args) {
        checkString("zgdfgdfgdf");
    }
    public static boolean checkString(String s) {
        var res= s.chars()
                .mapToObj(Integer::valueOf)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

       return res.size()==s.length();
    }
}
