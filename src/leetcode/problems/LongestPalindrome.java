package leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
  public static void main(String[] args) {
    System.out.println("Palindrome length: " + longestPalindrome("cccccddddd"));
  }

  public static int longestPalindrome(String s) {

    if (s.length() == 0) {
      return 0;
    }
    
    Map<Character, Integer> charMap = new HashMap<Character, Integer>();

    for (int i = 0; i < s.length(); i++) {
      char charAt = s.charAt(i);
      if (charMap.containsKey(charAt)) {
        charMap.put(charAt, new Integer(charMap.get(charAt).intValue() + 1));
      } else {
        charMap.put(charAt, new Integer(1));
      }
    }

    int maxPalinLength = 0;
    boolean atleastOneOdd = false;

    for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
      int intValue = entry.getValue().intValue();
      if (intValue % 2 == 0) {
        maxPalinLength = maxPalinLength + intValue;
      } else {
        atleastOneOdd = true;
        maxPalinLength = maxPalinLength + intValue - 1;
      }
    }

    if (atleastOneOdd) {
      maxPalinLength++;
    }

    return maxPalinLength;
  }
}
