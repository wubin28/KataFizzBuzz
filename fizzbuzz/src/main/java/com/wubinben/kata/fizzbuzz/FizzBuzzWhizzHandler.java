package com.wubinben.kata.fizzbuzz;

/**
 * User: Ben
 * Date: 13-12-19
 * Time: 上午9:42
 */
public class FizzBuzzWhizzHandler extends WordHandler {
    public FizzBuzzWhizzHandler(WordHandler wordHandler) {
        super(wordHandler);
    }

    @Override
    public Word handle(int number) {
        if (number % 5 == 0 && Integer.valueOf(number).toString().contains("3") && number % 7 == 0) {
            return new Word("FizzBuzzWhizz");
        }
        return getWordHandler().handle(number);
    }
}
