public class Pilot  extends CrewMember{
    private static final String rank = "Pilot" ;
    private static final String name = "Joe Duffy";

    private String licenseNo;

    public Pilot(String licenseNo){
        super(name, rank);
        this.licenseNo = licenseNo;

    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public String flyPlane() {
        return "I can fly a plane";
    }
}
