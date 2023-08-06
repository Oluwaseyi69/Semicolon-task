//package tdd;
//
//
//
//import org.junit.jupiter.api.Test;
//
//import java.time.LocalDate;
//import java.time.Month;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//
//
//public class ClassHeartRateTest {
//    @Test
//    public void testThatHeartRatesExists(){
//        HeartRate heartRate = new HeartRate( "Seyi", "Banwo", 13,"DECEMBER", 1990);
//    }
//    @Test
//    public void testThatHeartRatesHasFirstName(){
//        HeartRate heartRate = new HeartRate( "Seyi", "Banwo", 13,"DECEMBER", 1990);
//        heartRate.setFirstName("Seyi");
//        assertNotNull(heartRate.getFirstName());
//    }
//    @Test
//    public void testThatHeartRatesHasLastName(){
//        HeartRate heartRate = new HeartRate( "Seyi", "Banwo", 13,"DECEMBER", 1990);
//        heartRate.setLastName("Banwo");
//        assertNotNull(heartRate.getLastName());
//    }
//    @Test
//    public void testThatHeartRatesHasDateOfBirth(){
//        HeartRate heartRate = new HeartRate( "Seyi", "Banwo", 13,"DECEMBER", 1990);
//        heartRate.setDateOfBirth(13, "December", 1990);
//        LocalDate dateOfBirth = heartRate.getDateOfBirth();
//        assertEquals(LocalDate.of(1990, Month.DECEMBER, 13),dateOfBirth);
//    }
//    @Test
//    public void testCreatesHeartRatesUsingAllAttributes(){
//        HeartRate heartRate = new HeartRate( "Seyi", "Banwo", 13,"DECEMBER", 1990);
//        heartRate.setDateOfBirth(13,"DECEMBER",1990);
//        LocalDate dateOfBirth = heartRate.getDateOfBirth();
//        assertEquals(LocalDate.of(1990,Month.DECEMBER, 13), dateOfBirth);
//    }
//}
