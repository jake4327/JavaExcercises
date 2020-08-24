package com.qa.day11;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingPracTwo {

    private static String message;
    public static Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
        System.out.println(5.0/1.0);
        char[] cArray = {'a','b','c','d','e'};
        System.out.println(divide(cArray));
    }

    public static double divide(char[] cArray){
        try{
            message = "divide Success";
            return cArray[5];
        }catch(Exception e){
            message = "out of bounds";
            System.out.println("can't go out of an array");
        }finally{
            LOGGER.info(message);
        }
        return 0.0;
    }
}
