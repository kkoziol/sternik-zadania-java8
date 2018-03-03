package pl.sternik.kk.zadania.java8.lambdas;

import java.util.Map;
import java.util.TreeMap;

public class Zad04 {
  /**
   * Zamień każdą pare klucz wartośc z mapy, w string k-w
   * scal je w jeden string i wypisz na konsole.
   */
	public static void main(String[] args) {
    Map<String, Integer> map = new TreeMap<>();
    map.put("Ala", 1);
    map.put("ma", 2);
    map.put("kota", 1);
    map.put("a", 1);
    map.put("kot", 1);
    map.put("Ale", 1);

    StringBuilder sb = new StringBuilder();



    String result = sb.toString();
    System.out.println("rezultat = " + result);
  }

}
