package Job4j.Core_1_3_3.Task1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PutContainsKey {

    public static Map<Integer, User> addNewElementWithoutCheck(List<User> list) {
        Map<Integer, User> rsl = new HashMap<>();
        Integer count = 0;
        list.stream().forEach(el->rsl.put(el.id,el));
        return rsl;
    }

    public static Map<Integer, User> addNewElementWithCheck(List<User> list) {
        Map<Integer, User> rsl = new HashMap<>();
        list.stream()
                .filter(el-> !rsl.containsKey(el.id))
                .forEach(u->rsl.put(u.id,u));

            return rsl;
    }

    public record User(int id, String name) {
    }
}
