import java.util.ArrayList;

public class ConferenceRoom {

  private int capacity;
  private String name;
  private ArrayList<Guest> attendees;

  public ConferenceRoom(int capacity, String name) {
    this.capacity = capacity;
    this.name = name;
    this.attendees = new ArrayList<Guest>();
  }

  public String getName() {
    return this.name;
  }

  public int getAttendeeCount() {
    return this.attendees.size();
  }

  public int getCapacity() {
    return this.capacity;
  }

  public void addAttendee(Guest guest) {
    if (this.getAttendeeCount() < this.getCapacity()) {
      this.attendees.add(guest);
    }
  }

  public void removeAttendee(Guest guest) {
    this.attendees.remove(guest);
  }
}
