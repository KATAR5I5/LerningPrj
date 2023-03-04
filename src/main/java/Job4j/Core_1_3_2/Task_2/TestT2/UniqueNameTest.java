package Job4j.Core_1_3_2.Task_2.TestT2;

import Job4j.Core_1_3_2.Task_2.UniqueName;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class UniqueNameTest {
    @Test
    public void collectUniqueName() {
        List<UniqueName.User> users = List.of(
                new UniqueName.User(1, "name1"),
                new UniqueName.User(2, "name2"),
                new UniqueName.User(3, "name1"),
                new UniqueName.User(4, "name3"),
                new UniqueName.User(5, "name5"),
                new UniqueName.User(6, "name3")
        );
        int rsl = UniqueName.collectUniqueName(users);
        int expected = 4;
        assertThat(rsl, is(expected));
    }
}
