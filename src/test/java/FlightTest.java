import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    private Pilot pilot;
    private CabinCrewMember crewMember1;
    private CabinCrewMember crewMember2;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;

    @Before
    public void before(){
        flight = new Flight("PK 4907", "Phuket", "Edinburgh", "13:05",10000.00, 40);
        passenger1 = new Passenger("Jenny", 3);
        passenger2 = new Passenger("Tony", 1);
        passenger3 = new Passenger("Meredith", 2);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        crewMember1 = new CabinCrewMember();
        crewMember2 = new CabinCrewMember();
    }
    @Test
    public void getPassengerListCount(){
        assertEquals(3, flight.getListOfPassengersSize());
    }

    @Test
    public void canAddPassenger(){
        flight.addPassenger(passenger3);
        assertEquals(4, flight.getListOfPassengersSize());
    }

    @Test
    public void hasFlightNo(){
        assertEquals("PK 4907", flight.getFlightNo());
    }

    @Test
    public void hasDestination(){
        assertEquals("Phuket", flight.getDestination());
    }

    @Test
    public void hasDeparturePoint(){
        assertEquals("Edinburgh", flight.getDeparturePoint());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("13:05", flight.getDepartureTime());
    }
    @Test
    public void hasWeightCapacity(){
        assertEquals(10000.00, flight.getTotalWeightAllowed(), 0.0);
    }
    @Test
    public void canReturnNoOfSeats(){
        assertEquals(40, flight.getSeatCapacity());

    }
    @Test
    public void canReturnNoOfSeatsAvailable(){
        assertEquals(37, flight.getAvailableSeatsNo());

    }
    @Test
    public void canBookPassenger(){
        assertEquals(4, flight.bookPassenger(passenger1));

    }
}
