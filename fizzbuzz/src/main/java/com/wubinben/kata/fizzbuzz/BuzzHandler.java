package com.wubinben.kata.fizzbuzz;

/**
 * Created with IntelliJ IDEA.
 * User: Ben
 * Date: 13-12-18
 * Time: 下午7:07
 * To change this template use File | Settings | File Templates.
 */
public class BuzzHandler extends WordHandler {
    public BuzzHandler(WordHandler wordHandler) {
        super(wordHandler);
    }

    @Override
    public Word handle(int number) {
        if (number % 5 == 0) {
            return new Word("Buzz");
        }
        return wordHandler.handle(number);
    }
}
