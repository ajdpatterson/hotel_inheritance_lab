import java.util.ArrayList;

public class ConferenceRoom extends Room{
    private String name;
    public ConferenceRoom(int capacity, ArrayList<Guest> guestsInRoom, String name) {
        super(capacity, guestsInRoom);
        this.name = name;
    }
}
