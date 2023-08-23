package ArrayTest;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class SwapTest {
    @Test
    public void arrayCanSwapElements(){
        int [] numbers = {5,7,9,0};
        Swap.swap(numbers);
        int [] expected = {7,5,0,9};
        assertArrayEquals(expected,numbers);

    }
    @Test
    public void swapOddNumbers(){
        int [] numbers = {45,52,11,33,25,48};
        Swap.swapOdd(numbers);
        int[] expected = {45,52,33,11,25,48};
        assertArrayEquals(expected,numbers);
    }
    @Test
    public void swapFirstAndLastNumbers(){
        int [] numbers = {45,52,11,33,25,48};
        Swap.swapFirstAndLast(numbers);
        int[] expected = {48,25,33,11,52,45};
        assertArrayEquals(expected,numbers);
    }


}
