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
    public void testAssertEquals() {
        assertEquals("Failure - not same", 6L, 6L);
    }
}
