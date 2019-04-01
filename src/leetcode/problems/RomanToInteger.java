package leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

  public static void main(String[] args) {
    System.out.println("Answer: " + romanToInt("XIX"));
  }

  public static int romanToInt(String s) {

    Map<Character, Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);

    int result = 0;

    for (int i = 0; i < s.length(); i++) {

      int j = i + 1;;
      if (j < s.length() && map.get(s.charAt(i)) < map.get(s.charAt(j))) {
        result += (map.get(s.charAt(j)) - map.get(s.charAt(i)));
        i = j;
      } else {
        result += map.get(s.charAt(i));
      }
      j++;
    }


    return result;
  }
}
