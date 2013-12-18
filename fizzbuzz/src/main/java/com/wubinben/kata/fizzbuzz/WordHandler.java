package com.wubinben.kata.fizzbuzz;

/**
 * Created with IntelliJ IDEA.
 * User: Ben
 * Date: 13-12-18
 * Time: 下午7:03
 * To change this template use File | Settings | File Templates.
 */
public abstract class WordHandler {
    private WordHandler wordHandler;

    public WordHandler(WordHandler wordHandler) {
        this.wordHandler = wordHandler;
    }

    public abstract Word handle(int number, Word word);
}
