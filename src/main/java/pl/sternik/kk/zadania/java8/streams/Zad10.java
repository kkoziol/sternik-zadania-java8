package pl.sternik.kk.zadania.java8.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zad10 {
  private static final String REGEX = "[- .:,]+";

/**
   * Używając BufferedReadera do obróbki pliku, stwórz listę słów bez duplikatów,
   * skonwertowanych do małych znaków, posortowanych alfabetycznie.
   * Wypisz tą listę.
   *
   * @throws IOException 
   */
	public static void main(String[] args) throws IOException {
	    try (BufferedReader reader = 
	            Files.newBufferedReader(Paths.get("wiersz.txt"))) {

	    	List<String> words = reader.lines()
	              .collect(Collectors.toList());

	          words.stream().forEach(System.out::println);
	        }
	}
}
