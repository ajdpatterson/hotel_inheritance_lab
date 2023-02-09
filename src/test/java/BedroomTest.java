import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom1;
    Bedroom bedroom2;
    Booking booking;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;

    ArrayList<Guest> guests;

    @Before
    public void before(){
        guest1 = new Guest("John Smith");
        guest2 = new Guest("Billy Bones");
        bedroom1 = new Bedroom(guests, 1, RoomType.DOUBLE);
        bedroom2 = new Bedroom(guests, 2, RoomType.TRIPLE);
        booking = new Booking(bedroom1, 2);
    }

    @Test
    public void getBillingTotal(){
        assertEquals(100, booking.getBill(booking), 0.00);
    }
}
