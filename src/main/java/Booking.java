public class Booking {
    private Bedroom bedroom;
    private int numNights;

    public Booking(Bedroom bedroom, int numNights) {
        this.bedroom = bedroom;
        this.numNights = numNights;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public void setBedroom(Bedroom bedroom) {
        this.bedroom = bedroom;
    }

    public int getNumNights() {
        return numNights;
    }

    public void setNumNights(int numNights) {
        this.numNights = numNights;
    }

    public double getBill(Booking booking) {
        return booking.numNights * booking.bedroom.getRoomRate();
    }
}
