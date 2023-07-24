package tdd.practice;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CreditLimitCalculatorTest {
    @Test
    public void testThatCustomerHasAnAccountNumber(){
       CreditLimitCalculator firstBank = new CreditLimitCalculator();
       assertNotNull(firstBank);
    }
    @Test
    public  void testToGetNewBalance(){
        CreditLimitCalculator firstBank = new CreditLimitCalculator();
        int newBalance = firstBank.newBalance(500,20,300);
        assertEquals(220,newBalance);
    }

    @Test
    public void testCreditLimits(){
        CreditLimitCalculator firstBank = new CreditLimitCalculator();
        int creditLimits = firstBank.creditLimits();
    }

}
