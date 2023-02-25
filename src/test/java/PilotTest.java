import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("AB12345");

    }

    @Test
    public void hasName(){
        assertEquals("Joe Duffy", pilot.getName());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("I can fly a plane", pilot.flyPlane());
    }

}
