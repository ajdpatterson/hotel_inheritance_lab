import java.util.ArrayList;

public class Bedroom extends Room {

    private RoomType roomType;

    private int roomNumber;
    private double roomRate;
    public Bedroom(ArrayList<Guest> guestsInRoom, int roomNumber, RoomType roomType) {
        super(roomType.getCapacity(), guestsInRoom);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomRate = roomType.getRate();
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getRoomRate() {
        return roomRate;
    }
}
