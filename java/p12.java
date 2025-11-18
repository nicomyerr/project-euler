import java.util.stream.IntStream;

public class p12 {
  public static void main(String[] args) {
    System.out.println("Solution of problem 12: " + solve());
  }

  private static int solve() {
    int triangleNumber = 1;
    int n = 1;
    while (divisors(triangleNumber) <= 500) {
      n++;
      triangleNumber = triangleNumber(n);
    }
    return triangleNumber;
  }

  private static int triangleNumber(final int n) {
    return IntStream.rangeClosed(1, n).sum();
  }

  private static int divisors(final int number) {
    int divisors = 0;
    for (int i = 1; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        divisors += 2;
      }
    }
    return divisors;
  }
}
