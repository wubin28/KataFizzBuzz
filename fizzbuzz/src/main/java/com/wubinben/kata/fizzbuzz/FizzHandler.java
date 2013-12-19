package com.wubinben.kata.fizzbuzz;

/**
 * User: Ben
 * Date: 13-12-18
 * Time: 下午7:08
 */
public class FizzHandler extends WordHandler {
    public FizzHandler(WordHandler wordHandler) {
        super(wordHandler);
    }

    @Override
    public Word handle(int number) {
        if (number % 3 == 0 || Integer.valueOf(number).toString().contains("3")) {
            return new Word("Fizz");
        }
        return getWordHandler().handle(number);
    }
}
