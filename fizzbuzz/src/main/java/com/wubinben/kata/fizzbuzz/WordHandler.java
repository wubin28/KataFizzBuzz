package com.wubinben.kata.fizzbuzz;

/**
 * User: Ben
 * Date: 13-12-18
 * Time: 下午7:03
 */
public abstract class WordHandler {
    private WordHandler wordHandler;

    public WordHandler(WordHandler wordHandler) {
        this.wordHandler = wordHandler;
    }

    public abstract Word handle(int number);
}
