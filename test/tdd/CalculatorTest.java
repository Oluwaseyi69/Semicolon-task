//package tdd;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.Assert.*;
//
//public class CalculatorTest {
//    @Test
//    public void testThatCalculatorExist() {
//        Calculator calculator = new Calculator();
//        assertNotNull(calculator);
//    }
//
//    @Test
//    public void testThatCalculatorIsOn() {
//        Calculator calculator = new Calculator();
//        calculator.power();
//        assertTrue(calculator.isOn());
//    }
//
//    @Test
//    public void testThatCalculatorIsOff() {
//        Calculator calculator = new Calculator();
//        calculator.power();
//        assertTrue(calculator.isOn);
//        calculator.power();
//        assertFalse(calculator.isOn());
//    }
//
//    @Test
//    public void testThatCalculatorCanSumNumber() {
//        Calculator calculator = new Calculator();
//        calculator.power();
//        assertTrue(calculator.isOn());
//        calculator.add(15, 15);
//        assertEquals(30, calculator.getAdd());
//    }
//
//    @Test
//    public void testThatCalculatorCanDifferenceNumber() {
//        Calculator calculator = new Calculator();
//        calculator.power();
//        assertTrue(calculator.isOn());
//        calculator.add(-15, 15);
//        assertEquals(0, calculator.getAdd());
//    }
//
//}