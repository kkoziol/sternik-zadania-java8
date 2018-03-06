package pl.sternik.kk.zadania.java8.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zad03 {
	/**
	 * Zastąp wszystkie słowa na liście odpowiednikami pisanymi wielkimi literami.
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Ala", "ma", "kota", "a", "kot", "ma", "Ale."));
		
		
		list.replaceAll(String::toUpperCase);
		list.forEach((x) -> System.out.print(x.concat(" ")));
	}

}
