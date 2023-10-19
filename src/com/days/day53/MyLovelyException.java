package com.days.day53;

public class MyLovelyException extends Exception {

    @Override
    public String getMessage() {
        return "Hello Dear tester, this is my " +
                "lovely exception class.." +
                "You throw my exception so that " +
                "you can see this message!!!!";
    }

}
