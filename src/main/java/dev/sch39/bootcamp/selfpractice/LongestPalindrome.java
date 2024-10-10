package dev.sch39.bootcamp.selfpractice;

public class LongestPalindrome {
  public static String longestPalindrome(String s) {
    if (s.equals(new StringBuilder(s).reverse().toString())) {
      return s;
    }

    String left = longestPalindrome(s.substring(1));
    String right = longestPalindrome(s.substring(0, s.length() - 1));

    if (left.length() > right.length()) {
      return left;
    } else {
      return right;
    }
  }

  public static String longestPalindrome2(String s) {
    String maxStr = s.substring(0, 1);
    int maxLen = maxStr.length();

    for (int i = 0; i < s.length(); i++) {
      for (int j = i + maxLen; j <= s.length(); j++) {
        String currentStr = s.substring(i, j);
        if (j - i > maxLen
            && currentStr.equals(new StringBuilder(currentStr).reverse().toString())) {
          maxLen = j - i;
          maxStr = currentStr;
        }
      }
    }

    return maxStr;
  }

  public static void main(String[] args) {
    System.out.println(longestPalindrome("babad"));
    System.out.println(longestPalindrome("cbbd"));
    System.out.println("v-2");
    System.out.println(longestPalindrome2("babad"));
    System.out.println(longestPalindrome2("cbbd"));
  }
}
