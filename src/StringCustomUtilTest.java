import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCustomUtilTest {

    private StringCustomUtil st;

    @BeforeEach
    void setUp() {
        st = new StringCustomUtil();
    }

    @Test
    public void testCase() {
        String[] expected = new String[]{"good", "start"};
        assertArrayEquals(expected,st.testString("good", "start"));
        assertArrayEquals(null, st.testString("", "start"));
        String[] expected2 = new String[]{"sweet","sour"};
        assertArrayEquals(expected2,st.testString("this apple is  sweet", "this apple is sour"));
        String[] expected3 = new String[]{"banana"};
        assertArrayEquals(expected3, st.testString("apple apple","banana"));
    }
}