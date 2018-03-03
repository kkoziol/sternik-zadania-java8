package pl.sternik.kk.zadania.java8.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Zad08 {
  /**
   * Policz i wypisz liczbę lini w pliku używając BufferedReadera.
   * @throws IOException 
   */
	public static void main(String[] args) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("wiersz.txt"), StandardCharsets.UTF_8)) {

        }
  }
}
