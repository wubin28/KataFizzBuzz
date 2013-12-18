package com.wubinben.kata.fizzbuzz;

/**
 * User: Ben
 * Date: 13-12-18
 * Time: 下午2:20
 */
public class WordMaker {
    public static String translate(int i) {

        if (i % 15 == 0) {
            return "FizzBuzz";
        }
        if (i % 3 == 0) {
            return "Fizz";
        }
        if (i % 5 == 0) {
            return "Buzz";
        }
        return (new Integer(i)).toString();
    }
}
