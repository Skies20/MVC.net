package DaHotel;

public class Room {
	private String roomNumber;
    private boolean isOccupied;

    public Room(String roomNumber) {
        this.roomNumber = roomNumber;
        this.isOccupied = false;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void checkIn() {
        isOccupied = true;
    }

    public void checkOut() {
        isOccupied = false;
    }
}
