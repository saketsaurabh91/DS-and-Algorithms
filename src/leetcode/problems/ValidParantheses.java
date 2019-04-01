package leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class ValidParantheses {
  public static void main(String[] args) {
    System.out.println("Result : " + isValid("[]{}({"));
  }

  public static boolean isValid(String s) {

    Map<Character, Character> map = new HashMap<>();
    map.put('{', '}');
    map.put('[', ']');
    map.put('(', ')');


    if (s.length() % 2 != 0) {
      return false;
    }

    return removeValidParanthese(map, s);
  }

  private static boolean removeValidParanthese(Map<Character, Character> map, String s) {
    int removeAtPos = -1;
    boolean removed = false;
    for (int i = 0; i < s.length() - 1; i++) {
      if (map.get(s.charAt(i)) == null) {
        break;
      } else if (map.get(s.charAt(i)) == s.charAt(i + 1)) {
        removeAtPos = i;
        removed = true;
        break;
      }
    }
    return s.length() == 0 || (removed && removeValidParanthese(map,
        (s.substring(0, removeAtPos).toString() + s.substring(removeAtPos + 2, s.length()))));
  }
}
