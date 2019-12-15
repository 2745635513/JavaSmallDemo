package com.frace.thinking.exceptionChapter;


/**
 * Created by frace on 2019/11/24 16:20
 */
public class LoggingExceptions{
    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught " + e);
        }
    }
}
