package com.frace.thinking.exceptionChapter;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by frace on 2019/11/24 16:12
 */
public class LoggingException extends Exception {
    private static Logger logger = Logger.getLogger("LoggingEception");

    public LoggingException() {
        StringWriter sw = new StringWriter();
        printStackTrace(new PrintWriter(sw));
        /**
         * 当前为SEVERE消息级别启用了记录器，然后将给定消息转发到所有已注册的输出Handler对象。
         */
        logger.severe(sw.toString());
    }
}


