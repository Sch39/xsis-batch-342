package dev.sch39.bootcamp.logicphase.day09.parkingsystem;

public interface Ticket {
  public void entryParking(String dateTime);

  public void exitParking(String dateTime);

  public Long parkingTime();

  public Double getParkingFee(Long diffMinutes);
}
