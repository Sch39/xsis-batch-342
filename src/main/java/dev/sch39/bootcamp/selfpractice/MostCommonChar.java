package dev.sch39.bootcamp.selfpractice;

import java.util.HashMap;
import java.util.Map;

public class MostCommonChar {
  public static String mostCommonChar(String s) {
    s = s.toLowerCase(); // Mengubah ke huruf kecil
    char[] sArr = s.toCharArray(); // Mengubah string menjadi array karakter
    Map<Character, Integer> freqs = new HashMap<>(); // Map untuk menyimpan frekuensi huruf

    // Menghitung frekuensi masing-masing huruf
    for (char c : sArr) {
      freqs.put(c, freqs.getOrDefault(c, 0) + 1);
    }

    // Inisialisasi variabel untuk huruf dan jumlah kemunculan terbanyak
    char maxChar = '\0';
    int maxCount = 0;

    // Menemukan huruf yang paling sering muncul
    for (Map.Entry<Character, Integer> entry : freqs.entrySet()) {
      char charKey = entry.getKey();
      int count = entry.getValue();

      if (count > maxCount || (count == maxCount && charKey < maxChar)) {
        maxChar = charKey;
        maxCount = count;
      }
    }

    return String.valueOf(maxChar); // Mengembalikan huruf yang paling sering muncul
  }

  public static String mostCommonChar2(String in) {
    Map<String, Integer> map = new HashMap<>();
    for (int i = 0; i < in.length(); i++) {
      map.put(in.charAt(i) + "", map.getOrDefault(in.charAt(i) + "", 0) + 1);
    }
    String lowerChar = "";
    int maxCount = 0;
    for (Map.Entry<String, Integer> set : map.entrySet()) {
      if (set.getValue() >= maxCount
          || (set.getValue() == maxCount && set.getKey().compareTo(lowerChar) < 0)) {
        lowerChar = set.getKey();
        maxCount = set.getValue();
      }
    }

    return lowerChar;
  }

  public static void main(String[] args) {
    System.out.println(mostCommonChar("Letter !"));
    System.out.println(mostCommonChar("bbaa"));
    System.out.println("fn 2");
    System.out.println(mostCommonChar2("Letter !"));
    System.out.println(mostCommonChar2("bbaa"));

    System.out.println("a".compareTo("b"));
    System.out.println("c".compareTo("a"));
    System.out.println("char");
    int[] charIndex = new int[128];
    System.out.println(charIndex['b']);
  }
}
