package selfpractice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
  public static void main(String[] args) {
    Locale localeID = new Locale("id", "ID");
    Date today = new Date();

    DateFormat dateFormatID = new SimpleDateFormat("EEEE, dd MMMM YYYY", localeID);

    System.out.println("Sekarang: " + dateFormatID.format(today));
  }
}
