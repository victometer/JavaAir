public class Passenger {
    private String name;
    private int noOfBags;
    private BagType bagType;
    private double bodyWeight;

    public Passenger(String name, BagType bagtype, int noOfBags, double bodyWeight){
        this.name = name;
        this.bagType = bagtype;
        this.noOfBags = noOfBags;
        this.bodyWeight = bodyWeight;
    }

    public String getName() {
        return name;
    }

    public int getNoOfBags() {
        return noOfBags;
    }
}
