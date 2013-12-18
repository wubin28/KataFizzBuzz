package com.wubinben.kata.fizzbuzz;

/**
 * User: Ben
 * Date: 13-12-18
 * Time: 下午2:20
 */
public class WordMaker {
    public static String translate(int i) {
        WordHandler commonNumberHandler = new CommonNumberHandler(null);
        WordHandler whizzHandler = new WhizzHandler(commonNumberHandler);
        WordHandler buzzHandler = new BuzzHandler(whizzHandler);
        WordHandler fizzHandler = new FizzHandler(buzzHandler);
        WordHandler fizzBuzzHandler = new FizzBuzzHandler(fizzHandler);

        Word word = fizzBuzzHandler.handle(i);
        return word.say();
    }
}
