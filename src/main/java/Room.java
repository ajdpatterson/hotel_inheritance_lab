import java.util.ArrayList;

public abstract class Room {
    private int capacity;
    private ArrayList<Guest> guestsInRoom;

    public Room(int capacity, ArrayList<Guest> guestsInRoom){
        this.capacity = capacity;
        this.guestsInRoom = guestsInRoom;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getGuestsInRoom() {
        return guestsInRoom.size();
    }

    public void addGuestToRoom(Guest guest){
        guestsInRoom.add(guest);
    }

    public void removeGuestFromRoom(Guest guest){
        guestsInRoom.remove(guest);
    }
}
