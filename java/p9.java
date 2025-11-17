public class p9 {
  public static void main(String[] args) {
    System.out.println("Solution of problem 9: " + solve());
  }

  private static int solve() {
    for (int a = 1; a < 1000; a++) {
      for (int b = a + 1; b < 1000; b++) {
        final int c = 1000 - a - b;
        if (Functions.isPythagoreanTriplet(a, b, c)) {
          return a * b * c;
        }
      }
    }
    return 0;
  }
}
