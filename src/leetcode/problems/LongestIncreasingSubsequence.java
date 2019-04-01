package leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {

  public static void main(String[] args) {
    System.out.println("Longest subseq: " + longestSubsequence(new int[] {1, 2, 10, 3, 4, 5, 12, 6, 7}));
  }

  public static int longestSubsequence(int[] arr) {

    List<List<Integer>> ultimateList = new ArrayList<>();

    // [10, 9, 2, 5, 3, 7, 101, 18] --> , [10,9,2,5,3,4]
    
   
    
    int maxCount = 0;
    for (int i = 0; i < arr.length; i++) {
      int count = 1;
      int f = i, s = f + 1;
      while (s < arr.length) {
        if (arr[f] >= arr[s]) {
          s++;
        } else {
          count++;
          s++;
          f = s - 1;
        }
      }
      if (count > maxCount) {
        maxCount = count;
      }
    }

    return maxCount;
  }

}
