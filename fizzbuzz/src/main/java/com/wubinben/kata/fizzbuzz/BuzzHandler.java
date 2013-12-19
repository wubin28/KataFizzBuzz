package com.wubinben.kata.fizzbuzz;

/**
 * User: Ben
 * Date: 13-12-18
 * Time: 下午7:07
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
        return getWordHandler().handle(number);
    }
}
