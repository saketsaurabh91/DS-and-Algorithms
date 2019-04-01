package leetcode.problems;

public class ReverseInteger {
  public static void main(String[] args) { // 2147483647 1534236469
    System.out.println("Reverse: " + reverse(463847412));
  }

  public static int reverse(int x) {

    int reverse = 0;
     int max = (int) (Math.pow(2, 31) - 1);
     int min = (int) (Math.pow(2, 31)) * -1;

    while (x != 0) {
      int mod = x % 10;

      if (reverse >= max / 10 || reverse == max / 10 && mod > max % 10) {
        return 0;
      }

      if (reverse < min / 10 || reverse == min / 10 && mod < min % 10) {
        return 0;
      }
      reverse = reverse * 10 + mod;
      x = x / 10;
    }

    return reverse;
  }

}
