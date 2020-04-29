import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class BookingTest {

  Booking booking1;
  Bedroom bedroomSingle;


  @Before
  public void before(){
    bedroomSingle = new Bedroom(101, 1, "Single", 50);
    booking1 = new Booking(bedroomSingle, 2);

  }

  @Test
  public void hasDuration(){
    assertEquals(2, booking1.getDuration());
  }

  @Test
  public void roomExists(){
    assertEquals(bedroomSingle, booking1.getRoom());
  }

  @Test
  public void canCalcTotal(){
    assertEquals(100, booking1.calculateTotalBill());
  }
}
