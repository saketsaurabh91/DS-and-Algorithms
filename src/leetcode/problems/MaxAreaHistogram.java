package leetcode.problems;

public class MaxAreaHistogram {
  public static void main(String[] args) {
    System.out.println("Area is: " + maxArea(new int[] {6, 2, 5, 0, 5, 1, 6}));
  }

  public static int maxArea(int[] height) {

    int maxArea = 0;

    for (int i = 1; i < height.length; i++) {
      int superMin = height[i];
      for (int j = i - 1; j >= 0; j--) {
        superMin = Math.min(superMin, Math.min(height[i], height[j]));
        int area = superMin * (i - j + 1);

        if (area > maxArea) {
          maxArea = area;
        }
      }
    }

    return maxArea;

  }
}
