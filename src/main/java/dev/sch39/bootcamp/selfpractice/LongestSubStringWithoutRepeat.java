package dev.sch39.bootcamp.selfpractice;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeat {
  public static int lengthOfLongestSubstring(String s) {
    int maxCount = 0,
        start = 0;
    Map<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      Character currentChar = s.charAt(i);
      if (map.containsKey(currentChar)
          && map.get(currentChar) >= start) {
        start = map.get(currentChar) + 1;
      }

      map.put(currentChar, i);
      int currentLen = i + 1 - start;
      maxCount = Math.max(currentLen, maxCount);
    }
    return maxCount;
  }

  public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring("abcabcbb"));
  }
}
