package leetcode.problems;

public class ContainerWithMostWater {
  public static void main(String[] args) {
    System.out.println("Area is: " + maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}));
  }

  public static int maxArea(int[] height) {

    int maxArea = 0;

    for (int i = 1; i < height.length; i++) {
      for (int j = i - 1; j >= 0; j--) {
        int min = Math.min(height[i], height[j]);
        int area = min * (i - j);
        if (area > maxArea) {
          maxArea = area;
        }
      }
    }

    return maxArea;

  }
}
