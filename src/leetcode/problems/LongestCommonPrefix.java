package leetcode.problems;

public class LongestCommonPrefix {
  public static void main(String[] args) {

    System.out.println("Longest common prefix: " + longestCommonPrefix(new String[] {"aca", "cba"}));

  }

  public static String longestCommonPrefix(String[] strs) {

    String prefix = "";

    if (strs.length == 0) {
      return "";
    }

    String firstWord = strs[0];
    int index = 0;

    for (char c : firstWord.toCharArray()) {
      boolean result = true;
      for (int i = 1; i < strs.length; i++) {

        if (strs[i].length() == index) {
          return prefix;
        }

        if (c == strs[i].charAt(index)) {
          result &= true;
        } else {
          result &= false;
        }
      }
      if (result) {
        prefix += c;
      } else {
        return prefix;
      }
      index++;
    }

    return prefix;
  }
}
