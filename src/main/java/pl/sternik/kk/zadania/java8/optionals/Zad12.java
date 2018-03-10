package pl.sternik.kk.zadania.java8.optionals;

import java.io.IOException;
import java.util.Optional;

class Tick {

	public static final Tick NULL_TICK = new Tick("", 0);

	public Tick(String name, double price) {
		this.name = name;
		this.price = price;
	}

	String name;
	double price;

	@Override
	public String toString() {
		return "Tick [name=" + name + ", price=" + price + "]";
	}

}

public class Zad12 {

	public static Tick returnConcrteTick() {
		return new Tick("PZU", 1.2);
	}

	public static Tick returnRandomlyNull() {
		double random = Math.random();
		if (random < 0.5)
			return null;
		else
			return new Tick("PZU", random);
	}

	public static Optional<Tick> returnEmpty() {
		return Optional.empty();
	}

	public static Optional<Tick> returnTickInOptional() {
		return Optional.of(returnConcrteTick());
	}

	public static Optional<Tick> returnRandomlyOptional() {
		return Optional.ofNullable(returnRandomlyNull());
	}

	public static Tick returnRandomlyOptionalWithNullObj() {
		return Optional.ofNullable(returnRandomlyNull()).orElse(Tick.NULL_TICK);
	}

	public static void main(String[] args) throws IOException {

		Tick tick;
		Optional<Tick> ot;

		System.out.println("Typowy NPE - losowo:");
		tick = returnRandomlyNull();
		try {
			System.out.println(tick.toString());
		} catch (NullPointerException e) {
			System.out.println("Było NPE");
		}
		// Jeżeli w zmiennej tick jest obiekt wyswietl go.
		System.out.println("Typowy NPE - neutralizacja v1:");
		ot = Optional.ofNullable(tick);
		ot.ifPresent(s -> System.out.println(s + "ddddd"));

		// Jeżeli w zmiennej tick jest obiekt wyświetl go a jeżeli nie to
		// wyświetl NULL_TICK
		System.out.println("Typowy NPE - neutralizacja v2:");
		System.out.println(ot.orElse(Tick.NULL_TICK).toString());

		// Jeżeli w zmiennej tick jest obbiekt to go wyświetl, a jeżel nie to
		// napis "Nic nie było"
		System.out.println("Typowy NPE - neutralizacja v3:");
		if (ot.isPresent()) {
			System.out.println(ot.get());
		} else {
			System.out.println("Nic nie było!");
		}

        System.out.println("--------- map vs flatMap ---------");
        for (int i = 0; i < 5; i++) {
            Optional<Tick> tickInOptional = returnRandomlyOptional();
            System.out.print(tickInOptional.map(t -> Optional.of(t).map(n -> n.name.toLowerCase())));
            System.out.print("  versus  ");
            System.out.println(tickInOptional.flatMap(t -> Optional.of(t).map(n -> n.name.toLowerCase())));
        }

		// Jeżeli w zmiennej tick jest obiekt wyświetl go a jeżeli nie to
		// wyrzuć wyjątek IllegalStateException
		System.out.println("Typowy NPE - neutralizacja v4:");
		System.out.println(ot.orElseThrow(IllegalStateException::new).toString());
	}
}
