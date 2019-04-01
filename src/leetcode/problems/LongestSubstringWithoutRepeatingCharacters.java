package leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
  public static void main(String[] args) {
    System.out.println("Longest substring is: " + lengthOfLongestSubstring("dvdf"));
  }

  public static int lengthOfLongestSubstring(String s) {

    int index = 0, maxLength = 0;
    while (index < s.length()) {
      Set<Character> charSet = new HashSet<Character>();
      int runningLength = 0;
      while (index < s.length() && charSet.add(s.charAt(index))) {
        index++;
        runningLength++;
      }
      
      maxLength = Math.max(maxLength, runningLength);


    }

    return maxLength;
  }
}
