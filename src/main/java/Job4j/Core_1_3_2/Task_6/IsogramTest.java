package Job4j.Core_1_3_2.Task_6;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
public class IsogramTest {
    @Test
    public void checkStringTrue() {
        String s = "uncopyrightables";
        boolean b = Isogram.checkString(s);
        assertThat(b, is(true));
    }

    @Test
    public void checkStringFalse() {
        String s = "javascript";
        boolean b = Isogram.checkString(s);
        assertThat(b, is(false));
    }
}
