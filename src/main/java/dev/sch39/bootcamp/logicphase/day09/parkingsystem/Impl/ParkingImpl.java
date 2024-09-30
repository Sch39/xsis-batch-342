package dev.sch39.bootcamp.logicphase.day09.parkingsystem.Impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

import dev.sch39.bootcamp.logicphase.day09.parkingsystem.Ticket;

public class ParkingImpl implements Ticket {
  private LocalDateTime starDateTime, enDateTime;
  private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy HH:mm:ss",
      Locale.forLanguageTag("id-ID"));

  @Override
  public void entryParking(String dateTime) {
    this.starDateTime = LocalDateTime.parse(dateTime, this.formatter);
  }

  @Override
  public void exitParking(String dateTime) {
    this.enDateTime = LocalDateTime.parse(dateTime, this.formatter);
  }

  @Override
  public Long parkingTime() {
    return ChronoUnit.MINUTES.between(this.starDateTime, this.enDateTime);
  }

  @Override
  public Double getParkingFee(Long diffMinutes) {
    long diffHours = diffMinutes / 60;
    double fee = 0;

    if (diffHours <= 8) {
      fee = diffHours * 1000;
    } else if (diffHours <= 24) {
      fee = 8000;
    } else {
      long fullDays = diffHours / 24;
      long remainingHours = diffHours % 24;

      fee = fullDays * 15000;

      if (remainingHours <= 8) {
        fee += remainingHours * 1000;
      } else {
        fee += 8000;
      }
    }

    return fee;
  }
}
