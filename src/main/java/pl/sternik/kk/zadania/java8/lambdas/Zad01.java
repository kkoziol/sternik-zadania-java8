package pl.sternik.kk.zadania.java8.lambdas;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Zad01 {

	/**
	 * Utwórz ciąg, który składa się z pierwszej litery każdego słowa z listy.
	 */
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Ala", "ma", "kota", "a", "kot", "ma", "Ale.");

		StringBuilder sb = new StringBuilder();
		
		list.forEach(s -> sb.append(s.charAt(0)));
		String result = sb.toString();
		System.out.println("rezultat = " + result);
	}

}
