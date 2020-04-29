import java.util.ArrayList;
import java.util.HashMap;


public class Hotel {

  private ArrayList<Bedroom> bedrooms;
  private ArrayList<ConferenceRoom> conferenceRooms;
  private ArrayList<Booking> bookings;
  private HashMap<String, DiningRoom> diningrooms;


  public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms, HashMap<String, DiningRoom> diningrooms) {
    this.bedrooms = bedrooms;
    this.conferenceRooms = conferenceRooms;
    this.diningrooms = diningrooms;
    this.bookings = new ArrayList<Booking>();
  }

  public int getBedroomCount() {
    return this.bedrooms.size();
  }

  public int getConferenceRoomCount() {
    return this.conferenceRooms.size();
  }

  public void checkInGuest(Guest guest, Bedroom bedroom) {
    bedroom.addGuest(guest);
  }

  public void checkOutGuest(Guest guest, Bedroom bedroom) {
    bedroom.removeGuest(guest);
  }

  public void checkInAttendee(Guest guest, ConferenceRoom conferenceRoom) {
    conferenceRoom.addAttendee(guest);
  }

  public void checkOutAttendee(Guest guest, ConferenceRoom conferenceRoom) {
    conferenceRoom.removeAttendee(guest);
  }

  public void bookRoom(Bedroom bedroom, int numNights) {
    Booking booking = new Booking(bedroom, numNights);
    this.bookings.add(booking);

  }

  public int getBookingCount() {
    return this.bookings.size();
  }

  public int getDiningRoomCount() {
    return this.diningrooms.size();
  }

  public int getEmptyRoomCount() {

  }
}
