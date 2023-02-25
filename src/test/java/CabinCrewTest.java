import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {
    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember();
    }
    @Test
    public void canRelayMessage(){
        assertEquals("Welcome on board", cabinCrewMember.relayMessage());
    }
}
