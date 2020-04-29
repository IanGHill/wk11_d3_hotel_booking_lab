public class Booking {

  private Bedroom bedroom;
  private int numNights;
  public Booking(Bedroom bedroom, int numNights) {
    this.bedroom = bedroom;
    this.numNights = numNights;
  }

  public int getDuration() {
    return this.numNights;
  }

  public Bedroom getRoom() {
    return this.bedroom;
  }

  public int calculateTotalBill() {
    return this.numNights * this.bedroom.getRate();
  }
}
