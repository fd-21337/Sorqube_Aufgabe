import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StartStateTest {

    @Test
    public void test() {
        assertNull((new StartState()).change());
    }
}