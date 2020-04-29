import java.util.ArrayList;

public class Bedroom {

  private int roomNumber;
  private int capacity;
  private int rate;
  private String type;
  private ArrayList<Guest> guests;

  public Bedroom(int roomNumber, int capacity, String type, int rate) {
    this.roomNumber = roomNumber;
    this.capacity = capacity;
    this.type = type;
    this.rate = rate;
    this.guests = new ArrayList<Guest>();
  }

  public int getRoomNumber() {
    return this.roomNumber;
  }

  public int getRoomCapacity() {
    return this.capacity;
  }

  public String getRoomType() {
    return this.type;
  }

  public int getGuestCount() {
    return this.guests.size();
  }

  public void addGuest(Guest guest) {
    if (this.getGuestCount() < this.getRoomCapacity()) {
      this.guests.add(guest);
    }
  }

  public void removeGuest(Guest guest) {
    this.guests.remove(guest);
  }

  public int getRate() {
    return this.rate;
  }
}
