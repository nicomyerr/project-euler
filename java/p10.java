public class p10 {
  public static void main(String[] args) {
    System.out.println("Solution of problem 10: " + solve());
  }

  private static long solve() {
    // FIXME: this is pretty slow
    long sum = 0;
    for (int i = 2; i < 2000000; i++) {
      if (Functions.isPrime(i)) {
        sum += i;
      }
    }
    return sum;
  }
}
