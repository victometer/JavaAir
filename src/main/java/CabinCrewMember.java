public class CabinCrewMember extends CrewMember{
        private static final String rank = "Flight Attendant" ;
        private static final String name = "Jean Belle";

        public CabinCrewMember(){
            super(name, rank);

        }

    public String relayMessage() {
            return "Welcome on board";
    }
}
