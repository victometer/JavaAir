public enum BagType {
    CARRY_ON(10),
    HOLD(23),
    SPECIAL(35);

    private final int weight;

    BagType(int weight) {
        this.weight = weight;
    }
}
