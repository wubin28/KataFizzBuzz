package com.wubinben.kata.fizzbuzz;

/**
 * Created with IntelliJ IDEA.
 * User: Ben
 * Date: 13-12-18
 * Time: 下午7:04
 * To change this template use File | Settings | File Templates.
 */
public class CommonNumberHandler extends WordHandler {
    public CommonNumberHandler(WordHandler wordHandler) {
        super(wordHandler);
    }

    @Override
    public Word handle(int number, Word word) {
        return new Word((new Integer(number)).toString());
    }
}
