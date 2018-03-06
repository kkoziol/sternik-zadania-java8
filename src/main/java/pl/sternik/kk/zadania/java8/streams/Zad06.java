package pl.sternik.kk.zadania.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zad06 {
  /**
   * Zmodyfikuj rozwiązanie z pierwszego zadania, 
   * tak by nowa lista zawierała tylko wyrazy o nie pażystej długości.
   */
	public static void main(String[] args) {
	    List<String> list = Arrays.asList("Ala", "ma", "kota", "a", "kot", "ma", "Ale.");

	    List<String> newList = list.stream()
	            .filter(w -> w.length() % 2 == 1)
	            .map(String::toLowerCase)
	            .collect(Collectors.toList());

	        newList.forEach(System.out::println);
  }
}
