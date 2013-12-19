package com.wubinben.kata.fizzbuzz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static junit.framework.TestCase.assertEquals;

/**
 * User: Ben
 * Date: 13-12-18
 * Time: 下午1:30
 */
@RunWith(JUnit4.class)
public class FizzBuzzTest {
    @Test
    public void GIVEN_One_SHOULD_SayOne() {
        assertEquals("Failure - 1 should be 1", "1", WordMaker.translate(1));
    }

    @Test
    public void GIVEN_Three_SHOULD_SayFizz() {
        assertEquals("Failure - 3 should be Fizz", "Fizz", WordMaker.translate(3));
    }

    @Test
    public void GIVEN_Five_SHOULD_SayBuzz() {
        assertEquals("Failure - 5 should be Buzz", "Buzz", WordMaker.translate(5));
    }

    @Test
    public void GIVEN_Fifteen_SHOULD_SayFizzBuzz() {
        assertEquals("Failure - 15 should be FizzBuzz", "FizzBuzz", WordMaker.translate(15));
    }

    @Test
    public void GIVEN_Thirty_SHOULD_SayFizzBuzz() {
        assertEquals("Failure - 30 should be FizzBuzz", "FizzBuzz", WordMaker.translate(30));
    }

    @Test
    public void GIVEN_Seven_SHOULD_SayWhizz() {
        assertEquals("Failure - 7 should be Whizz", "Whizz", WordMaker.translate(7));
    }

    @Test
    public void GIVEN_TwentyThree_SHOULD_SayFizz() {
        assertEquals("Failure - 23 should be Fizz", "Fizz", WordMaker.translate(23));
    }

    @Test
    public void GIVEN_ThirtyFive_SHOULD_SayFizzBuzzWhizz() {
        assertEquals("Failure - 35 should be FizzBuzz", "FizzBuzzWhizz", WordMaker.translate(35));
    }

}
