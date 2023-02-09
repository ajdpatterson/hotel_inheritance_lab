import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public int getNumRooms() {
        return this.bedrooms.size();
    }

    public void checkInBedroom(Guest guest, Bedroom bedroom){
        bedroom.addGuestToRoom(guest);
    }

    public void checkOutBedroom(Guest guest, Bedroom bedroom) {
        bedroom.removeGuestFromRoom(guest);
    }

    public Booking bookRoom(Bedroom bedroom, int numNights) {
        return new Booking(bedroom, numNights);
    }
}
