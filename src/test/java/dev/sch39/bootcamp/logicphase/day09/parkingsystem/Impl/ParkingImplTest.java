package dev.sch39.bootcamp.logicphase.day09.parkingsystem.Impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

@Tags({
    @Tag("day09"),
    @Tag("parking-impl")
})
public class ParkingImplTest {
  private ParkingImpl parking;

  @BeforeEach
  public void setUp() {
    parking = new ParkingImpl();
  }

  @Test
  public void testEntryAndExitParking() {
    parking.entryParking("29 September 2024 10:00:00");
    parking.exitParking("29 September 2024 12:00:00");
    Long parkingTime = parking.parkingTime();
    assertEquals(120, parkingTime);
  }

  @Test
  public void testParkingFeeForLessThan8Hours() {
    parking.entryParking("29 September 2024 10:00:00");
    parking.exitParking("29 September 2024 15:00:00");
    Long parkingTime = parking.parkingTime();
    Double fee = parking.getParkingFee(parkingTime);
    assertEquals(5000, fee);
  }

  @Test
  public void testParkingFeeForExactly8Hours() {
    parking.entryParking("29 September 2024 10:00:00");
    parking.exitParking("29 September 2024 18:00:00");
    Long parkingTime = parking.parkingTime();
    Double fee = parking.getParkingFee(parkingTime);
    assertEquals(8000, fee);
  }

  @Test
  public void testParkingFeeForLessThan24Hours() {
    parking.entryParking("29 September 2024 10:00:00");
    parking.exitParking("30 September 2024 10:00:00");
    Long parkingTime = parking.parkingTime();
    Double fee = parking.getParkingFee(parkingTime);
    assertEquals(8000, fee);
  }

  @Test
  public void testParkingFeeForMoreThan24Hours() {
    parking.entryParking("28 September 2024 10:00:00");
    parking.exitParking("30 September 2024 10:00:00");
    Long parkingTime = parking.parkingTime();
    Double fee = parking.getParkingFee(parkingTime);
    assertEquals(30000, fee);
  }

}
