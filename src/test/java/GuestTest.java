import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

  Guest dave;

  @Before
  public void before(){
    dave = new Guest("Dave");
  }

  @Test
  public void hasName(){
    assertEquals("Dave", dave.getName());
  }
}
