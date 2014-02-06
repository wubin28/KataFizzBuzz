package com.wubinben.kata.fizzbuzz;

/**
 * User: Ben
 * Date: 13-12-18
 * Time: 下午7:04
 */
public class CommonNumberHandler extends WordHandler {
    public CommonNumberHandler() {
        super(null);
    }

    @Override
    public Word handle(int number) {
        return new Word(Integer.valueOf(number).toString());
    }
}
