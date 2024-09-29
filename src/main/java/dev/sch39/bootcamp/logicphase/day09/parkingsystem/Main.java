package dev.sch39.bootcamp.logicphase.day09.parkingsystem;

import dev.sch39.bootcamp.logicphase.day09.parkingsystem.Impl.ParkingImpl;

public class Main {

  public static void main(String[] args) {
    Ticket parkingTicket = new ParkingImpl();
    parkingTicket.entryParking("2024-09-27T07:30:34");
    parkingTicket.exitParking("2024-09-27T20:03:35");
    System.out.println("Biaya parkir: Rp " + parkingTicket.getParkingFee(parkingTicket.parkingTime()));
  }
}
