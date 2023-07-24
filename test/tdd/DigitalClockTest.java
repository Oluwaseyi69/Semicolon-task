package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitalClockTest {
    @Test
    public void testSeconds(){
        DigitalClock clock = new DigitalClock();
        clock.setSeconds(360);
        assertEquals(0, clock.getHour());
        assertEquals(6, clock.getMinutes());
        assertEquals(0, clock.getSeconds());

    }
}

