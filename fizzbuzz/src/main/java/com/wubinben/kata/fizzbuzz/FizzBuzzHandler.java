package com.wubinben.kata.fizzbuzz;

/**
 * Created with IntelliJ IDEA.
 * User: Ben
 * Date: 13-12-18
 * Time: 下午7:10
 * To change this template use File | Settings | File Templates.
 */
public class FizzBuzzHandler extends WordHandler {
    public FizzBuzzHandler(WordHandler wordHandler) {
        super(wordHandler);
    }

    @Override
    public Word handle(int number) {
        if (number % 15 == 0) {
            return new Word("FizzBuzz");
        }
        return wordHandler.handle(number);
    }
}
