package app;

public class Logger {
    private static Logger logger;
    int messageCounter = 0;

    private Logger() {
        logger = this;
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String message) {
        messageCounter++;
        System.out.println(message);
    }

    public int getMessageCounter() {
        return messageCounter;
    }
}
