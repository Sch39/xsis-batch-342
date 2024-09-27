package logicphase.exercises.day10.parkingsystem;

public interface Ticket {
  public void entryParking(String dateTime);

  public void exitParking(String dateTime);

  public Long parkingTime();

  public Double getParkingFee(Long diffMinutes);
}
