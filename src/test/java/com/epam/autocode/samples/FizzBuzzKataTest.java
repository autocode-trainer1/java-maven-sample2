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
  public void testFizzForInputThree() {

    String result = fizzBuzz.checkFizzBuzz(3);
    assertEquals(FIZZ, result, "3 should be fizz");
  }

  @Test
  public void testFizzForInputMultipleOfThree() {
    String result = fizzBuzz.checkFizzBuzz(9);
    assertEquals(FIZZ, result, "9 should be fizz");
  }

  @Test
  public void testBuzzForInputFive() {
    String result = fizzBuzz.checkFizzBuzz(5);
    assertEquals(BUZZ, result, "5 should be buzz");
  }

  @Test
  public void testBuzzForInputMultipleOfFive() {
    String result = fizzBuzz.checkFizzBuzz(25);
    assertEquals(BUZZ, result, "25 should be buzz");
  }

  @Test
  public void testSameDigitAsResponseForInputNotMultipleOfThreeNorFive() {
    String result = fizzBuzz.checkFizzBuzz(7);
    assertEquals("7", result, "7 should be 7");
  }

  @Test
  public void testFizzBuzzForInputMultipleOfThreeAndFive() {
    String result = fizzBuzz.checkFizzBuzz(15);
    assertEquals(FIZZ_BUZZ, result, "15 should be fizzbuzz");
  }

  @Test
  public void testFizzBuzzZeroWithJunit5() {
    assertThrows(IllegalArgumentException.class,
            () -> fizzBuzz.checkFizzBuzz(0),
            "0 should throw an exception");
  }
}
