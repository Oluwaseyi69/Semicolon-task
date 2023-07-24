package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MinutesTest {

    @Test
    public void testThatMinutesToSeconds(){
        Minutes minutes = new Minutes();
        minutes.setMinutes(-2);
        assertEquals(0,minutes.getSeconds());
        minutes.setMinutes(0);
        assertEquals(0, minutes.getSeconds());
    }
    @Test
    public void testThatMinutesToYear(){
        Minutes minutes = new Minutes();
        minutes.setMinutes(-1000000);
        assertEquals(0,minutes.getYear());
        minutes.setMinutes(1000);
        assertEquals(0,minutes.getYear());
    }
    @Test
    public void testThatMinutesToDay(){
        Minutes minutes = new Minutes();
        minutes.setMinutes(1000);
        assertEquals(0,minutes.getDay());
        minutes.setMinutes(1000);
        assertEquals(0,minutes.getDay());
    }
}
