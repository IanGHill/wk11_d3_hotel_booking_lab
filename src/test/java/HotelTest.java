import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HotelTest {

  Hotel hotel;
  Bedroom bedroomSingle;
  Bedroom bedroomDouble;
  ConferenceRoom conferenceRoom1;
  ConferenceRoom conferenceRoom2;
  Guest dave;
  Guest claire;
  Booking booking1;
  DiningRoom diningRoom1;
  DiningRoom diningRoom2;
  HashMap<String, DiningRoom> diningrooms;


  @Before
  public void before(){
    bedroomSingle = new Bedroom(101, 1, "Single", 50);
    bedroomDouble = new Bedroom(102, 2, "Double", 70);
    conferenceRoom1 = new ConferenceRoom(8, "conference room 1");
    conferenceRoom2 = new ConferenceRoom(4, "conference room 2");
    diningRoom1 = new DiningRoom("Mickie Ds");
    diningRoom2 = new DiningRoom("Big Ks");

    dave = new Guest("Dave");
    claire = new Guest("Claire");
    ArrayList<Bedroom> bedrooms = new ArrayList<Bedroom>();
    bedrooms.add(bedroomSingle);
    bedrooms.add(bedroomDouble);
    ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<ConferenceRoom>();
    conferenceRooms.add(conferenceRoom1);
    conferenceRooms.add(conferenceRoom2);
    diningrooms = new HashMap<String, DiningRoom>();
    diningrooms.put(diningRoom1.getName(), diningRoom1);
    diningrooms.put(diningRoom2.getName(), diningRoom2);
    hotel = new Hotel(bedrooms, conferenceRooms, diningrooms);
    booking1 = new Booking(bedroomSingle, 2);
  }

  @Test
  public void hasBedrooms(){
    assertEquals(2, hotel.getBedroomCount());
  }

  @Test
  public void hasConferencerooms(){
    assertEquals(2, hotel.getConferenceRoomCount());
  }

  @Test
  public void canCheckGuestIntoBedroom(){
    hotel.checkInGuest(dave, bedroomSingle);
    assertEquals(1, bedroomSingle.getGuestCount());
  }

  @Test
  public void canCheckGuestOutBedroom(){
    hotel.checkInGuest(dave, bedroomDouble);
    hotel.checkInGuest(claire, bedroomDouble);
    hotel.checkOutGuest(dave, bedroomDouble);
    assertEquals(1, bedroomDouble.getGuestCount());
  }

  @Test
  public void canCheckAttendeeIntoConferenceRoom(){
    hotel.checkInAttendee(dave, conferenceRoom1);
    assertEquals(1, conferenceRoom1.getAttendeeCount());
  }

  @Test
  public void canCheckOutAttendeeFromConferenceRoom(){
    hotel.checkInAttendee(dave, conferenceRoom1);
    hotel.checkInAttendee(claire, conferenceRoom1);
    hotel.checkOutAttendee(dave, conferenceRoom1);
    assertEquals(1, conferenceRoom1.getAttendeeCount());

  }

  @Test
  public void canAddBooking(){
    hotel.bookRoom(bedroomSingle, 2);
    assertEquals(1, hotel.getBookingCount());
  }

  @Test
  public void hasDiningRooms(){
    assertEquals(2, hotel.getDiningRoomCount());
  }

  @Test
  public void hasEmptyRooms(){
    assertEquals(1, hotel.getEmptyRoomCount());
  }
}
