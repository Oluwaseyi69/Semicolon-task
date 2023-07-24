package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    @Test
    public void isOnTest() {
        Bike bmx = new Bike();
        boolean status = bmx.getIsOn();
        assertFalse(status);
        bmx.setIsOn();
        boolean newStatus = bmx.getIsOn();
        assertTrue(newStatus);
    }
    @Test
    public void isOffTest() {
        Bike bmx = new Bike();
        boolean status = bmx.getIsOn();
        assertFalse(status);
        bmx.getIsOn();
        boolean newStatus = bmx.getIsOff();
        assertTrue(newStatus);
    }
    @Test
    public void testThatBikeSpeedIsAcceleratedByOneAtGearOne() {
        Bike myBike = new Bike();
        myBike.setSpeed(20);
        myBike.accelerate(1);
        assertEquals(21, myBike.getSpeed());
    }
    @Test
    public void testThatBikeSpeedCannotBeAcceleratedByTwoAtGearOne() {
        Bike myBike = new Bike();
        myBike.setSpeed(25);
        myBike.accelerate(1);
        assertEquals(25, myBike.getSpeed());
    }
    @Test
    public void keepGearAtTwoWhenBikeSpeedIsAcceleratedByTwo() {
        Bike myBike = new Bike();
        myBike.setSpeed(25);
        myBike.accelerate(2);
        assertEquals(27, myBike.getSpeed());
    }
    @Test
    public void keepGearAtThreeWhenBikeSpeedIsAcceleratedByThree() {
        Bike myBike = new Bike();
        myBike.setSpeed(33);
        myBike.accelerate(3);
        assertEquals(36, myBike.getSpeed());
    }
    @Test
    public void keepGearAtFourWhenBikeSpeedIsAcceleratedByFour() {
        Bike myBike = new Bike();
        myBike.setSpeed(44);
        myBike.accelerate(4);
        assertEquals(48, myBike.getSpeed());
    }
   @Test
    public void makeBikeSpeedDeceleratesInDecrementOfOneWhenGearIsAtOne(){
        Bike myBike = new Bike();
        myBike.setSpeed(15);
        myBike.decelerate(1);
        assertEquals(14,myBike.getSpeed());
    }
    @Test
    public void makeBikeSpeedDeceleratesInDecrementOfTwoWhenGearIsAtTwo(){
        Bike myBike = new Bike();
        myBike.setSpeed(24);
        myBike.decelerate(2);
        assertEquals(22,myBike.getSpeed());
    }
    @Test
    public void whenGearIsAtThreeLetBikeSpeedDeceleratesInDecrementOfThree(){
        Bike myBike = new Bike();
        myBike.setSpeed(35);
        myBike.decelerate(3);
        assertEquals(32,myBike.getSpeed());
    }
    @Test
    public void whenGearIsAtFourLetBikeSpeedDeceleratesInDecrementOfFour(){
        Bike myBike = new Bike();
        myBike.setSpeed(48);
        myBike.decelerate(4);
        assertEquals(44, myBike.getSpeed());
    }
    @Test
    public void givenThatBikeGearCanChangeFromGearOneToGearTwo() {
        Bike myBike = new Bike();
        myBike.setSpeed(20);
        myBike.accelerate(1);
        assertEquals(21, myBike.getSpeed());
        assertEquals(2, myBike.getGear());
    }

}