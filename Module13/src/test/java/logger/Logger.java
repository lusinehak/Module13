package logger;

import org.apache.logging.log4j.LogManager;

public class Logger {

    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger(Logger.class);


    public static void error(String message, Throwable throwable) {
        logger.error(message, throwable);
    }

    public static void error(String message) {
        logger.error(message);
    }

    public static void info(String message) {
        logger.info(message);
    }

    public static void debug(String message) {
        logger.debug(message);
    }

    public static void warn(String message) {
        logger.warn(message);
    }

    public static void log(String message){
        logger.info(message);
    }
}
