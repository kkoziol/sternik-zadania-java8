package pl.sternik.kk.zadania.java8.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zad02 {
	/**
	 * Usuń z listy słowa, które mają nieparzyste długości.
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Ala", "ma", "kota", "a", "kot", "ma", "Ale."));
		
		

		list.forEach(System.out::println);

	}

}
