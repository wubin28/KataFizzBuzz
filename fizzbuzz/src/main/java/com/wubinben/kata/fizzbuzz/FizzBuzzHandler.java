package com.wubinben.kata.fizzbuzz;

/**
 * User: Ben
 * Date: 13-12-18
 * Time: 下午7:10
 */
public class FizzBuzzHandler extends WordHandler {
    public FizzBuzzHandler(WordHandler wordHandler) {
        super(wordHandler);
    }

    @Override
    public Word handle(int number) {
        if (number % 15 == 0 || (number % 5 == 0 && Integer.valueOf(number).toString().contains("3"))) {
            return new Word("FizzBuzz");
        }
        return wordHandler.handle(number);
    }
}
