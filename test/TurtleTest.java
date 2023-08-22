import Assignment.eStore.Turtle;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertNotNull;

public class TurtleTest {

    Turtle turtle;
    @BeforeEach
    public void startWithThis(){
        turtle = new Turtle();
    }

    @Test
    public void testThatTurtleExist(){
        Turtle turtle = new Turtle();
        assertNotNull(turtle);
    }
    @Test
    public void  testThatPenIsUp(){
        Turtle turtle = new Turtle();
        turtle.penIsUp();
    }

}
