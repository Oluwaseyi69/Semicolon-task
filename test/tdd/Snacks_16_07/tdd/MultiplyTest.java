package tdd.Snacks_16_07.tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MultiplyTest {
    @Test
    public void testNumberCanMultiply(){
        Multiply multiply = new Multiply();
       int total = Multiply.multiply(-5,3);
        assertEquals(-15, -15,total);
    }
    @Test
    public void testNumberCanSquare(){
        Multiply multiply = new Multiply();

    }


}
