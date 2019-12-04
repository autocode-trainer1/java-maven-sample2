package com.epam.autocode.samples;

public class FizzBuzzKata {

  private static final String FIZZ = "Fizz";
  private static final String BUZZ = "Buzz";

  public String checkFizzBuzz(int number) {
    if (number == 0) {
      throw new IllegalArgumentException("number must be positive");
    }

    String result = "";

    if (isFizz(number)) {
      result += FIZZ;
    }

    if (isBuzz(number)) {
      result += BUZZ;
    }

    if (result.isEmpty()) {
      result += String.valueOf(number);
    }

    return result;
  }

  private boolean isFizz(int number) {
    return number % 3 == 0;
  }

  private boolean isBuzz(int number) {
    return number % 5 == 0;
  }
}
