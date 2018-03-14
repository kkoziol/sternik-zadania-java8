package pl.sternik.kk.zadania.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zad07 {
  /**
   * Połącz trzeci, czwarty i piąty element listy w jeden string
   * karzdy wyraz oddziel kreseczką (-). Wypisz rezultat na konsole.
   */
	public static void main(String[] args) {
	    List<String> list = Arrays.asList("Ala", "ma", "kota", "a", "kot", "ma", "Ale.");

	    String merged = list.stream()
	            .skip(2)
	            .filter( s -> !"a".equals(s))
	            .limit(3)
	            .collect(Collectors.joining("-"));
	    System.out.println(merged);
  }
}
