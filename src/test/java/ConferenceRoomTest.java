import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

  ConferenceRoom conferenceRoom1;
  ConferenceRoom conferenceRoom2;
  Guest dave;
  Guest claire;

  @Before
  public void before(){
    conferenceRoom1 = new ConferenceRoom(8, "conference room 1");
    conferenceRoom2 = new ConferenceRoom(4, "conference room 2");
    dave = new Guest("Dave");
    claire = new Guest("Claire");
  }

  @Test
  public void hasName(){
    assertEquals("conference room 1", conferenceRoom1.getName());
  }

  @Test
  public void startsEmpty(){
    assertEquals(0, conferenceRoom1.getAttendeeCount());
  }

  @Test
  public void hasCapacity(){
    assertEquals(8, conferenceRoom1.getCapacity());
  }

  @Test
  public void cantGoOverCapacity(){
    conferenceRoom2.addAttendee(dave);
    conferenceRoom2.addAttendee(dave);
    conferenceRoom2.addAttendee(dave);
    conferenceRoom2.addAttendee(dave);
    conferenceRoom2.addAttendee(dave);
    assertEquals(4, conferenceRoom2.getAttendeeCount());
  }
}
