public class p14 {
  public static void main(String[] args) {
    System.out.println("Solution of problem 14: " + solve());
  }

  private static int solve() {
    int startingNumber = 0;
    int chainLength = 0;
    for (int i = 1; i < 1000000; i++) {
      int currentLength = 1;
      long number = i;
      while (number != 1) {
        if (number % 2 == 0) {
          number /= 2;
        } else {
          number = 3 * number + 1;
        }
        currentLength++;
      }
      if (currentLength > chainLength) {
        chainLength = currentLength;
        startingNumber = i;
      }
    }
    return startingNumber;
  }
}
