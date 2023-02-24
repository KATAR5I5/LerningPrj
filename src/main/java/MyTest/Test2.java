package MyTest;

import java.util.*;


public class Test2 {
    public static void main(String[] args) {
        Map<String, List<String>> result = new HashMap<>();
        method("<Пушкин>:<Сказка 1>", result);
        method("<Пушкин>:<Сказка 2>", result);
        method("<Пушкин>:<Сказка 3>", result);
        method("<Пушкин>:<Сказка 4>", result);
        method("<Пушкин>:<Сказка 5>", result);
        method("<Пушкин>:<Сказка 6>", result);
        method("<Пушкин>:<Сказка 7>", result);
        method("<Пушкин>:<Сказка 8>", result);
        method("<Пушкин>:<Сказка 9>", result);
        method("<Тургенев>:<Сказка 9>", result);
        method("<Тургенев>:<Сказка 9>", result);
        method("<Тургенев>:<Сказка 9>", result);
        method("<Гримм>:<Сказка 9>", result);
        method("<Гримм>:<Сказка 9>", result);
        method("<Гримм>:<Сказка 9>", result);
        method("<Есенин>:<Сказка 9>", result);
        method("<Пушкин>:<Сказка>", result);
        for (Map.Entry el : result.entrySet()) {
            System.out.println(el.getKey() + ":" + el.getValue());
        }
    }

    static void method(String string, Map<String, List<String>> map) {
        String author = string.substring(1, string.indexOf(">:<"));
        String book = string.substring(string.indexOf(">:<") + 3, string.lastIndexOf(">"));
        if (map.containsKey(author))
            map.get(author).add(book);
        else {
            List<String> books = new ArrayList<>();
            books.add(book);
            map.put(author, books);
        }
    }
}
