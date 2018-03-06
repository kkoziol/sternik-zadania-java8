package pl.sternik.kk.zadania.java8.dates;

import java.time.*;

public class Zad16 {
	 
	public static void main(String[] args) {
        System.out.println("\n ile trwa doba?");
        
        //2017-marzec-26 godzina 1:10 dodaj 1 dzien i policz ile mineło godzin.
        LocalDate localDate = LocalDate.of(2017, Month.MARCH, 26);
        LocalTime localTime = LocalTime.of(1, 10);
        ZonedDateTime warsaw = ZonedDateTime.of(localDate, localTime, ZoneId.of("Europe/Warsaw"));
        ZonedDateTime oneDayLater = warsaw.plusDays(1);
        Duration duration = Duration.between(warsaw, oneDayLater);
        System.out.println(warsaw);
        System.out.println(duration);
        System.out.println("bo tego dnia ...");
	      }
}
