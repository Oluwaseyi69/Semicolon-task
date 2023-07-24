package tdd.Snacks_16_07.tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PowerTest {
    @Test
    public void testNumberRaiseToPower(){
        Power power = new Power();
        Power.power(6,3);
        int result =  1;
        assertEquals(216,216, result);


    }
}
