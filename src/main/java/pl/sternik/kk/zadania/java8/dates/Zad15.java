package pl.sternik.kk.zadania.java8.dates;

import java.time.*;

public class Zad15 {

	public static void main(String[] args) {
		System.out.println("Swirniete ruskie");
		// 2014-luty-5 10:21
		LocalDate localDate = LocalDate.of(2014, Month.FEBRUARY, 5);
		LocalTime localTime = LocalTime.of(10, 21);
		LocalDateTime local = LocalDateTime.of(localDate, localTime);
		ZonedDateTime warsaw = ZonedDateTime.of(local, ZoneId.of("Europe/Warsaw"));
		ZonedDateTime moscow = warsaw.withZoneSameInstant(ZoneId.of("Europe/Moscow"));
		System.out.println(warsaw);
		System.out.println(moscow);
		System.out.println("3h delta");

		// 2015-luty-5 10:21
		localDate = LocalDate.of(2015, Month.FEBRUARY, 5);
		localTime = LocalTime.of(10, 21);
		local = LocalDateTime.of(localDate, localTime);
		warsaw = ZonedDateTime.of(local, ZoneId.of("Europe/Warsaw"));
		moscow = warsaw.withZoneSameInstant(ZoneId.of("Europe/Moscow"));
		System.out.println(warsaw);
		System.out.println(moscow);
		System.out.println("2h delta");
	}
	
	//Dlaczego o co chodzi?
}
