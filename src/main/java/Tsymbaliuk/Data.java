package Tsymbaliuk;

import java.util.*;

public class Data {
    public static final String string = "Here yo2u can ываорыорлы 5675 find acti3vities to вапвыпв practi44se your 234234 reading ваыпвапвап ski6lls. 23423 Read7ing will help you to improve your under767standing of the 45language and build your vocabulary.";
    public static List<String> listStrings = Arrays.asList(string.split(" "));

    static Map<Integer, String> getMapIS() {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "o");
        map.put(2, "oo");
        map.put(3, "o");
        map.put(4, "oooo");
        map.put(5, "oooo");

        return map;
    }

    public static List<Integer> integerList =
            new ArrayList<>(Arrays.asList(
                    999, 103, 220, 339, 53, 14, 225, 226, 227, 999, 228, 339, 30, 14, 225, 226, 227, 228, 999));

}
