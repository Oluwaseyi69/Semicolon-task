package tdd.Snacks_16_07.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tdd.CreditCardValidator;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCardValidatorTest {
    @Test
    public void testThatCreditCardExist() {
        CreditCardValidator creditCardValidator = new CreditCardValidator();
        creditCardValidator.setCardLength("5369020005703360");
        assertEquals(16, creditCardValidator.getCardLength());
    }
    @Test
    public void testThatCreditCardIsValid(){
        CreditCardValidator creditCardValidator = new CreditCardValidator();
        creditCardValidator.setValidityStatus("5399831619690403");
        assertEquals("Valid",creditCardValidator.getValidityStatus());
    }
    @Test
    public void testCreditCardType(){
        CreditCardValidator creditCardValidator = new CreditCardValidator();
        creditCardValidator.setCardType("0003450126712345");
        assertEquals("Invalid card number", creditCardValidator.getCardType());


    }


}
