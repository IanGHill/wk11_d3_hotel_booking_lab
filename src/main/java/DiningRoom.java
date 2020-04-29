import java.util.ArrayList;

public class DiningRoom {

  private String name;
  private ArrayList<Guest> diners;

  public DiningRoom(String name) {
    this.name = name;
    diners = new ArrayList<Guest>();
  }

  public String getName() {
    return this.name;
  }

  public int getDinerCount() {
    return this.diners.size();
  }
}
