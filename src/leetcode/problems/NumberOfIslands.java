package leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class NumberOfIslands {

  public static void main(String[] args) {
    char grid[][] =
        {{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};
    System.out.println(numIslands(grid));
  }

  public static int numIslands(char[][] grid) {

    int numberOfIslands = 0;
    Map<Integer, Character> onesMap = new HashMap<>();
    int count = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        
        if (grid[i][j] == '1') {
          onesMap.put(count, 'N');
        }
        count++;
      }
    }


    return numberOfIslands;
  }

}
