package pl.sternik.kk.zadania.java8.dates;

import java.time.*;

public class Zad13 {

	public static void main(String[] args) {

		// Dodaj 60 sekund, 20 milisekund i 20 nano sekund.
        Instant now = Instant.now();
        Instant later = now.plusSeconds(60).plusMillis(2).plusNanos(20);
        System.out.println("now  "+now);
        System.out.println("later"+later);
        System.out.println("Instant zawsze jest w UTC!");

        // Na podstawie czasu instant (now)  utwórz czas dmienną w czasie Warszawskim.
        ZonedDateTime dateTime = ZonedDateTime.ofInstant(now, ZoneId.of("Europe/Warsaw"));
        System.out.println("zoned"+dateTime);
        System.out.println("ZonedDateTime to Instant plus strfa czasowa");
		
	}
}
