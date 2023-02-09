public enum RoomType {
    SINGLE(1, 10),
    DOUBLE(3, 50),
    TRIPLE(3, 80),
    FAMILY(4, 100);

    private final int capacity;

    private final double rate;

    RoomType(int capacity, double rate) {
        this.capacity = capacity;
        this.rate = rate;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getRate() {
        return rate;
    }
}

