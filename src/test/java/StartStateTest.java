import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StartStateTest {

    @Test
    void test() {
        assertNull((new StartState()).change());
    }
}
