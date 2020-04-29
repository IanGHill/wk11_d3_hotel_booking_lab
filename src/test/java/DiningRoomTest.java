import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

  DiningRoom diningRoom;

  @Before
  public void before(){
    diningRoom = new DiningRoom("Mickie Ds");
  }

  @Test
  public void hasName(){
    assertEquals("Mickie Ds", diningRoom.getName());
  }

  @Test
  public void startsEmpty(){
    assertEquals(0, diningRoom.getDinerCount());
  }
}
