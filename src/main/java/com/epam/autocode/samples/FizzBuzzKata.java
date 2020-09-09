package com.epam.autocode.samples;

public class FizzBuzzKata {

  private static final String FIZZ = "Fizz";
  private static final String BUZZ = "Buzz";

  private static final int FIZZ_NUMBER = 3;
  private static final int BUZZ_NUMBER = 5;

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
      result += String.valueOf(number + 1); //made a mistake
    }

//also left commented out code    
//     if (result.isEmpty()) {
//       result += String.valueOf(number);
//     }

    return result;
  }

  private boolean isFizz(int number) {
    return number % FIZZ_NUMBER == 0;
  }

  private boolean isBuzz(int number) {
    return number % BUZZ_NUMBER == 0;
  }
}
