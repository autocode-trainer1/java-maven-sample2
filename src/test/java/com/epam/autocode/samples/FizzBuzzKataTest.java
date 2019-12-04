package com.epam.autocode.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class FizzBuzzKataTest {

  private static final String FIZZ = "Fizz";
  private static final String BUZZ = "Buzz";
  private static final String FIZZ_BUZZ = "FizzBuzz";

  private FizzBuzzKata fizzBuzz = new FizzBuzzKata();

  @Test
  public void getFizzForInputThree() {

    String result = fizzBuzz.checkFizzBuzz(3);
    assertEquals(FIZZ, result);
  }

  @Test
  public void getFizzForInputMultipleOfThree() {
    String result = fizzBuzz.checkFizzBuzz(9);
    assertEquals(FIZZ, result);
  }

  @Test
  public void getBuzzForInputFive() {
    String result = fizzBuzz.checkFizzBuzz(5);
    assertEquals(BUZZ, result);
  }

  @Test
  public void getBuzzForInputMultipleOfFive() {
    String result = fizzBuzz.checkFizzBuzz(25);
    assertEquals(BUZZ, result);
  }

  @Test
  public void getSameDigitAsResponseForInputNotMultipleOfThreeNorFive() {
    String result = fizzBuzz.checkFizzBuzz(7);
    assertEquals("7", result);
  }

  @Test
  public void getFizzBuzzForInputMultipleOfThreeAndFive() {
    String result = fizzBuzz.checkFizzBuzz(15);
    assertEquals(FIZZ_BUZZ, result);
  }

  @Test
  public void testFizzBuzzZeroWithJunit5() {
    assertThrows(IllegalArgumentException.class, () -> fizzBuzz.checkFizzBuzz(0));
  }
}
