package com.wubinben.kata.fizzbuzz;

/**
 * User: Ben
 * Date: 13-12-18
 * Time: 下午8:01
 */
public class WhizzHandler extends WordHandler {
    public WhizzHandler(WordHandler wordHandler) {
        super(wordHandler);
    }

    @Override
    public Word handle(int number) {
        if (number % 7 == 0) {
            return new Word("Whizz");
        }
        return wordHandler.handle(number);
    }
}
