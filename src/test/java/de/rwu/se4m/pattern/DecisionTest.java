package de.rwu.se4m.pattern;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class DecisionTest {

    @Test
    /**
     * Check for Exceptions thrown
     */
    void nextTest1() {
        HashMap map = new HashMap();
        assertThrows(RuntimeException.class,() ->Decision.next(map));
        map.put("state","Hallo");
        var ex = assertThrows(RuntimeException.class,() ->Decision.next(map));
        assertEquals("something went wrong", ex.getMessage());
    }

    @Test
    /**
     * Check for going to emergency
     */
    void nextNormal2Emergency() {
        HashMap map = new HashMap();
        map.put("state","Normal");
        map.put("incident", "fire");
        assertEquals("Emergency",Decision.next(map));
    }
}