package pl.sternik.kk.zadania.java8.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zad11 {
   private static final String REGEX = "[- .:,]+";
	 
  /**
   * Zmodyfikuj zadanie 10, tak aby słowa były posortowane względem długości.
   *
   * @throws IOException 
   */
	public static void main(String[] args) throws IOException {
	    try (BufferedReader reader = 
	            Files.newBufferedReader(Paths.get("wiersz-full.txt"))) {

	    	List<String> words = reader.lines()
	              .flatMap(line -> Stream.of(line.split(REGEX)))
	              .map(String::toLowerCase)
	              .distinct()
	              .sorted((a, b) -> a.length() - b.length())
	              .collect(Collectors.toList());

	          words.stream().forEach(System.out::println);
	        }
	      }
}
