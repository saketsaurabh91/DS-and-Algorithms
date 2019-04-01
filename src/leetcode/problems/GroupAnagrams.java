package leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import com.sun.xml.internal.txw2.output.StreamSerializer;

public class GroupAnagrams {

  public static void main(String[] args) {

    String arr[] = {"cab", "tin", "pew", "duh", "may", "ill", "buy", "bar", "max", "doc" , "abc"};
    System.out.println(groupAnagrams(arr));

  }

  public static List<List<String>> groupAnagrams(String[] strs) {

    Map<String, List<String>> group = new HashMap<>();

    for (int i = 0; i < strs.length; i++) {

      char[] charArray = strs[i].toCharArray();
      Arrays.sort(charArray); 
      
      String key = new String(charArray);
      
      if (group.containsKey(key)) {
        List<String> value = group.get(key);
        
        value.add(strs[i]);

      } else {
        List<String> value = new ArrayList<>();
        value.add(strs[i]);
        group.put(key, value);
      }

    }
    return new ArrayList(group.values());
  }

}
