package pl.sternik.kk.zadania.java8.dates;

import java.time.*;

public class Zad14 {

	public static void main(String[] args) {
		
		//LocalDate to czas lokalny bez strefy, nie sa przywiązane do osi czasu
		//tak jakby nie maja realnego znaczenia.
		
		System.out.println("Jaja z róznicami");
		// 2016-august-5 godzina 10:21
		LocalDate localDate = LocalDate.of(2016, Month.AUGUST, 5);
		LocalTime localTime = LocalTime.of(10, 21);
		// teraz złóż to do kupy
		LocalDateTime local = LocalDateTime.of(localDate, localTime);
		// i przekształć na czas Warszawski i Australijski/Sydney
		ZonedDateTime warsaw = ZonedDateTime.of(local, ZoneId.of("Europe/Warsaw"));
		ZonedDateTime sydney = warsaw.withZoneSameInstant(ZoneId.of("Australia/Sydney"));
		System.out.println(warsaw);
		System.out.println(sydney);
		System.out.println("8h delta?");

		// 2016-february-5 godzina jak porzednio
		localDate = LocalDate.of(2016, Month.FEBRUARY, 5);
		local = LocalDateTime.of(localDate, localTime);
		warsaw = ZonedDateTime.of(local, ZoneId.of("Europe/Warsaw"));
		sydney = warsaw.withZoneSameInstant(ZoneId.of("Australia/Sydney"));
		System.out.println(warsaw);
		System.out.println(sydney);
		System.out.println("10h delta");

		// 2016-october-5 godzina jak poprzdnio
		localDate = LocalDate.of(2016, Month.OCTOBER, 5);
		local = LocalDateTime.of(localDate, localTime);
		warsaw = ZonedDateTime.of(local, ZoneId.of("Europe/Warsaw"));
		sydney = warsaw.withZoneSameInstant(ZoneId.of("Australia/Sydney"));
		System.out.println(warsaw);
		System.out.println(sydney);
		System.out.println("9h delta");

	    // Ale co co chodzi?
	}
}
