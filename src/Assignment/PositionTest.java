package Assignment;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PositionTest {
    @Test
    public void testThePositionOfNumbers(){
        Position position = new Position();
        int [] actual = Position.position(5,18,32,3,4);
        int [] expected = {3, 2, 1, 5, 4};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testThatForPosition(){

    }
}
