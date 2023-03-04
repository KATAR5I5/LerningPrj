package Job4j.Core_1_3_3.Task1;
import Job4j.Core_1_3_3.TAsk2.PutIfAbsent;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;

public class PutIfAbsentTest {
    @Test
    public void addNewElement() {
        Map<Integer, PutIfAbsent.User> map = new HashMap<>(
                Map.of(
                        1, new PutIfAbsent.User(1, "Name1"),
                        2, new PutIfAbsent.User(2, "Name2")
                )
        );
        PutIfAbsent put = new PutIfAbsent(map);
        PutIfAbsent.User user = new PutIfAbsent.User(1, "Name3");
        boolean rsl = put.addNewElement(user);
        assertThat(rsl, is(false));
    }

    @Test
    public void addNewElementTrue() {
        Map<Integer, PutIfAbsent.User> map = new HashMap<>(
                Map.of(
                        1, new PutIfAbsent.User(1, "Name1"),
                        2, new PutIfAbsent.User(2, "Name2")
                )
        );
        PutIfAbsent put = new PutIfAbsent(map);
        PutIfAbsent.User user = new PutIfAbsent.User(3, "Name3");
        boolean rsl = put.addNewElement(user);
        assertThat(rsl, is(true));
    }
}
