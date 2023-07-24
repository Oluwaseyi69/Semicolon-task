package tdd.practice;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class SalesCommissionCalculatorTest {
    @Test
    public void testSalesCommissionCalculator(){
        SalesCommission jumia = new SalesCommission();
        double value = jumia.value(239.99);
        assertEquals(221.60,221.60,0.5);

    }

}
