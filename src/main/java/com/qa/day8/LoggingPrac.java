package com.qa.day8;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingPrac {

    /*public static Logger LOGGER = Logger.getLogger("Log file 1");
    public static LogManager LOGMANAGER = LogManager.getLogManager();*/

    public static Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
        logMessageInfo("too much java, lost track of days");
        logMessageDebug("too much java, lost track of days");
        logMessageFatal("too much java, lost track of days");
        logMessageTrace("too much java, lost track of days");
        logMessageWarn("too much java, lost track of days");
    }

    public static void logMessageInfo(String message) {
        System.out.println(LOGGER.getName());
        LOGGER.info(message);
    }

    public static void logMessageTrace(String message) {
        LOGGER.trace(message);
    }


    public static void logMessageDebug(String message) {
        LOGGER.debug(message);
    }

    public static void logMessageWarn(String message) {
        LOGGER.warn(message);
    }

    public static void logMessageFatal(String message) {
        LOGGER.fatal(message);
    }

    /*public static void printLogsInLogManager() {
        Logger logOne = LOGMANAGER.getLogger("Log file 1");
        System.out.println(logOne.getName());
        logOne.info("the next log");
    }*/
    /*
    public static void logMessageTrace(String message) {
        LOGGER.trace(message);
    }


    public static void logMessageDebug(String message) {
        LOGGER.debug(message);
    }

    public static void logMessageWarn(String message) {
        LOGGER.warn(message);
    }

    public static void logMessageFatal(String message) {
        LOGGER.fatal(message);
    }*/




}
