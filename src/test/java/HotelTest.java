import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Booking booking;
    Bedroom bedroom1;
    Bedroom bedroom2;
    ConferenceRoom conferenceRoom;
    Guest guest1;

    Guest guest2;

    ArrayList<Guest> guests;

    ArrayList<Bedroom> bedrooms;

    ArrayList<ConferenceRoom> conferenceRooms;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;




    @Before
    public void before(){
        guest1 = new Guest("John Smith");
        guest2 = new Guest("Billy Bones");
        guests = new ArrayList<>();
        bedroom1 = new Bedroom(guests, 1, RoomType.DOUBLE);
        bedroom2 = new Bedroom(guests, 2, RoomType.TRIPLE);

        conferenceRoom1 = new ConferenceRoom(100, guests, "Alpha");
        conferenceRoom2 = new ConferenceRoom(100, guests, "Beta");

        hotel = new Hotel(bedrooms, conferenceRooms);
    }

    @Test
    public void hasBedrooms(){
        hotel.addBedroom(bedroom1);
        assertEquals(1, hotel.getNumRooms());
    }

    @Test
    public void canAddGuestToBedroom(){
        hotel.addBedroom(bedroom1);
        hotel.checkInBedroom(guest1, bedroom1);
        assertEquals(1, bedroom1.getGuestsInRoom());
    }

    @Test
    public void canRemoveGuest(){
        hotel.addBedroom(bedroom1);
        hotel.checkInBedroom(guest1, bedroom1);
        hotel.checkInBedroom(guest2, bedroom1);

        hotel.checkOutBedroom(guest1, bedroom1);
        assertEquals(1, bedroom1.getGuestsInRoom());
    }

    @Test
    public void canBookRoom(){
        hotel.addBedroom(bedroom1);
        booking = hotel.bookRoom(bedroom1,2);
        assertEquals(2, booking.getNumNights());
    }
}
