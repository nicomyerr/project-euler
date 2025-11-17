import java.util.List;

public class Functions {
  public static boolean isProduct(final long product, final List<Integer> factors) {
    long factorsProduct = 1;
    for (int i = 0; i < factors.size(); i++) {
      factorsProduct *= factors.get(i);
    }
    return product == factorsProduct;
  }

  public static boolean isPrime(final int number) {
    for (int i = 1; i <= number; i++) {
      if (number % i == 0 && i != 1 && i != number) {
        return false;
      }
    }
    return true;
  }

  public static boolean isPalindrome(final int number) {
    String numberString = String.valueOf(number);
    for (int i = 0; i < numberString.length() / 2; i++) {
      if (numberString.charAt(i) != numberString.charAt((numberString.length() - 1) - i)) {
        return false;
      }
    }
    return true;
  }

  public static boolean isDivisible(final int number) {
    for (int i = 1; i <= 20; i++) {
      if (number % i != 0) {
        return false;
      }
    }
    return true;
  }

  public static int sumOfSquares() {
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      sum += i * i;
    }
    return sum;
  }

  public static int squareOfSum() {
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      sum += i;
    }
    return sum * sum;
  }

  public static long productOfString(final String number) {
    long product = 1;

    for (int i = 0; i < number.length(); i++) {
      long tmp = Long.valueOf(String.valueOf(number.charAt(i)));
      product *= tmp;
    }

    return product;
  }

  public static boolean isPythagoreanTriplet(final int a, final int b, final int c) {
    return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
  }
}
