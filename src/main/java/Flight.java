import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger> listOfPassengers;
    private String flightNo;
    private String destination;
    private String departurePoint;
    private String departureTime;
    private double totalWeightAllowed;
    private int seats;
    private int maxBagWeightPP;

    public Flight (String flightNo, String destination, String departurePoint, String departureTime, double totalWeightAllowed, int seats, int maxBagWeightPP){
        this.listOfPassengers = new ArrayList<>();
        this.flightNo = flightNo;
        this.destination = destination;
        this.departurePoint = departurePoint;
        this.departureTime = departureTime;
        this.totalWeightAllowed = totalWeightAllowed;
        this.seats = seats;
        this.maxBagWeightPP = maxBagWeightPP;
    }


    public int getListOfPassengersSize() {
        return listOfPassengers.size();
    }

    public void addPassenger(Passenger passenger){
        this.listOfPassengers.add(passenger);
    }

    public String getFlightNo() {
        return flightNo;
    }

    public String getDestination() {
        return destination;
    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public double getTotalWeightAllowed() {
        return totalWeightAllowed;
    }

    public int getSeatCapacity() {
        return seats;
    }

    public int getAvailableSeatsNo() {
        return (getSeatCapacity() - getListOfPassengersSize());
    }

    public int getMaxBagWeightPP() {
        return maxBagWeightPP;
    }

    public int bookPassenger(Passenger passenger) {
        if(getAvailableSeatsNo() >0){
            addPassenger(passenger);
        }
        return getListOfPassengersSize();
    }
}
