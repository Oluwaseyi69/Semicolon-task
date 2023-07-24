package tdd;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TelevisionTest {
    @Test
    public void powerOnTest() {
        Television sony = new Television();
        sony.setPowerOn(false);
        boolean status = sony.getPowerOn();
        assertEquals(false, status);
        sony.setPowerOn(true);
        status = sony.getPowerOn();
        assertEquals(true, status);
    }

    @Test
    public void powerOffTest(){
        Television sony = new Television();
        sony.setPowerOn(true);
        boolean status = sony.getPowerOn();
        assertTrue(status);
        sony.setPowerOn(false);
        boolean newStatus = sony.getPowerOn();
        assertFalse(newStatus);

    }


}
