import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {

    @Test
    void successTest() {
        assertEquals(true, true);
    }

    @Test
    void negativeTest() {
        assertEquals(true,false);
    }

    @Test
    void successWithHamcrestTest() {
        assertThat(true, is(true));
    }

    @Test
    void negativeWithHamcrestTest() {
        assertThat(true, is(false));
    }

}
