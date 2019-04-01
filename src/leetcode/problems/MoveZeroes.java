package leetcode.problems;

public class MoveZeroes {

  public static void main(String[] args) {

    int arr[] = {0, 1, 0, 3, 12};
    moveZeroes(arr);
    System.out.println(arr);
  }

  public static void moveZeroes(int[] nums) {


    for (int i = 0; i < nums.length; i++) {

      int j = i;
      while (nums[j] == 0 && j < nums.length -1) {
        j++;

      }

      nums[i] = nums[j];

      while (j > i) {
        nums[j] = 0;
        j--;
      }


    }

  }

}
