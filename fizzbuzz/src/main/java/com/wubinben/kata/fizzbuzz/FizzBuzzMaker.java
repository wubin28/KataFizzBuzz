package com.wubinben.kata.fizzbuzz;

import sun.plugin.dom.exception.InvalidStateException;

/**
 * User: Ben
 * Date: 13-12-18
 * Time: 下午2:20
 */
public class FizzBuzzMaker {
    public static String translate(int i) {
        if (i == 1) {
            return "1";
        }
        if (i == 3) {
            return "Fizz";
        }
        if (i == 5) {
            return "Buzz";
        }
        throw new InvalidStateException("the number to be translated " + i + " is invalid.");
    }
}
