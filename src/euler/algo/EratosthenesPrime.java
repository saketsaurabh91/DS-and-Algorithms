package euler.algo;

public class EratosthenesPrime {


  public static void main(String[] args) {
    long time = System.currentTimeMillis();
    printArray(sievePrimeNumbers(populateNumberArray(10000000))); 
    System.out.println("Time->" + (System.currentTimeMillis() - time));
  }

  private static int[] populateNumberArray(int x) {
    int[] numbers = new int[x - 1];
    int i = 0;
    while (i < numbers.length) {
      numbers[i] = i + 2;
      i++;
    }
    // printArray(numbers);
    return numbers;
  }

  private static int[] sievePrimeNumbers(int[] numbers) {

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] != 0) {
        for (int j = 2 * numbers[i] - 2; j < numbers.length; j += numbers[i]) {
          numbers[j] = 0;
        }
      }
    }
    return numbers;
  }

  private static void printArray(int[] numbers) {
    int i = 0 , c =1;
    while (i < numbers.length) {
      if (numbers[i] != 0) {
        System.out.println(numbers[i]);
        c++;
      }
      i++;
    }
    System.out.println("size->" + c);
  }
}
