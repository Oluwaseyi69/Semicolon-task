package tdd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void testThatACarExist(){
        Car bentley = new Car();
        bentley.setYear("2019");
        Assertions.assertNotNull(bentley.getYear());
        bentley.getYear();
        assertEquals("2019", bentley.getYear());
    }
    @Test
    public void testThatIsOn(){
        Car bentley = new Car();
        bentley.start();
        assertTrue(bentley.isOn);
    }
    @Test
    public void testThatIsOff(){
        Car bentley = new Car();
        bentley.start();
        assertTrue(bentley.isOn);
        bentley.start();
        assertFalse(bentley.isOn());
    }
    @Test
    public void testTheModelOfTheFirstCar(){
        Car bentley = new Car();
        bentley.setModel("Bentayga");
        assertNotNull(bentley.getModel());
        bentley.getModel();
        assertEquals("Bentayga",bentley.getModel());
    }
    @Test
    public void testTheModelOfSecondCar(){
        Car bentley = new Car();
        bentley.setModel("Continental");
        assertNotNull(bentley.getModel());
        bentley.getModel();
        assertEquals("Continental",bentley.getModel());
    }
    @Test
    public void testTheYearOfTheFirstCar(){
        Car bentley = new Car();
        bentley.setYear("2019");
        assertNotNull(bentley.getYear());
        bentley.getYear();
        assertEquals("2019",bentley.getYear());
    }
    @Test
    public void testTheYearOfTheSecondCar(){
        Car bentley = new Car();
        bentley.setYear("2021");
        assertNotNull(bentley.getYear());
        bentley.getYear();
        assertEquals("2021",bentley.getYear());
    }
    @Test
    public void testTheDiscountOnFirstCar(){
        Car bentley = new Car();
        bentley.setPrice(1000);
        bentley.discount(5);
        assertEquals(950,bentley.getPrice(), 0);
    }
    @Test
    public void testTheDiscountOnSecondCar(){
        Car bentley = new Car();
        bentley.setPrice(5000);
        bentley.discount(7);
        assertEquals(4650,bentley.getPrice(),0);
    }
}
