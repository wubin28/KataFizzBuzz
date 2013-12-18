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
    public void GIVEN_One_SHOULD_One() {
        assertEquals("Failure - 1 should be 1", "1", FizzBuzzMaker.translate(1));
    }

    @Test
    public void GIVEN_Three_SHOULD_Fizz() {
        assertEquals("Failure - 3 should be Fizz", "Fizz", FizzBuzzMaker.translate(3));
    }
}
