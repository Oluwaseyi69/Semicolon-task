//package ArrayTest;
//
//import org.junit.jupiter.api.Test;
//import tdd.ElementCheck;
//
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class ElementTest {
//
//    @Test
//    public void testThatElementIsPresent(){
//        int[] answer = ElementCheck.checkElement(56, 75, 45, 35, 89, 23, 56, 47, 38);
//        assertEquals(5, answer);
//    }
//
//    @Test
//    public void testThatElementIsNotPresent(){
//        int[] answer = ElementCheck.checkElement(56, 75, 45, 35, 89, 23, 47, 38);
//        assertEquals(-1, answer);
//    }
//   @Test
//   public void testThatElementIsPresentTwice(){
//        int[] answer = ElementCheck.checkElement(56, 75, 56, 35, 89, 23, 46, 47, 56, 38);
//        int[] know = {1, 7};
//       assertArrayEquals( know ,answer);
//   }
//
//}
