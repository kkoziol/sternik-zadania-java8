package pl.sternik.kk.zadania.java8.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zad09 {
  private static final String REGEX = "[- .:,]+";

/**
   * Używając BufferedReadera do obróbki pliku, stwórz listę słów bez duplikatów
   * Wypisz tą listę.
   *
   * @throws IOException 
   */
	public static void main(String[] args) throws IOException {
	    try (BufferedReader reader = 
	            Files.newBufferedReader(Paths.get("wiersz.txt"))) {

	    	List<String> uniqueWords = reader.lines()
	              .flatMap(line -> Stream.of(line.split(REGEX)))
	              .distinct()
	              .collect(Collectors.toList());

	          uniqueWords.stream()
	              .forEach(System.out::println);
	        }
  }
}
