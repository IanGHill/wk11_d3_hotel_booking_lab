import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

  Bedroom bedroomSingle;
  Bedroom bedroomDouble;
  Guest dave;
  Guest claire;

  @Before
  public void before(){
    bedroomSingle = new Bedroom(101, 1, "Single", 50);
    bedroomDouble = new Bedroom(102, 2, "Double", 70);
    dave = new Guest("Dave");
    claire = new Guest("Claire");
  }

  @Test
  public void hasRoomNumber(){
    assertEquals(101, bedroomSingle.getRoomNumber());
  }

  @Test
  public void hasCapacity(){
    assertEquals(2, bedroomDouble.getRoomCapacity());
  }

  @Test
  public void hasType(){
    assertEquals("Double", bedroomDouble.getRoomType());
  }

  @Test
  public void hasGuests(){
    bedroomDouble.addGuest(dave);
    bedroomDouble.addGuest(claire);
    assertEquals(2, bedroomDouble.getGuestCount());
  }

  @Test
  public void cantGoOverCapacity(){
    bedroomSingle.addGuest(dave);
    bedroomSingle.addGuest(dave);
    assertEquals(1, bedroomSingle.getGuestCount());
  }

}
