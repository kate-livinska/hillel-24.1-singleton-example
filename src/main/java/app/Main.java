package app;

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        String message = "First message to log";

        Logger logger = Logger.getInstance();
        logger.log(message);
        counter++;

        String message2 = "Second message to log";
        logger.log(message2);
        counter++;

        Logger logger2 = Logger.getInstance();
        String message3 = "Third message to log";
        logger2.log(message3);
        counter++;

        System.out.println("Number of messages logged: " + logger2.getMessageCounter());

        if (counter == logger2.getMessageCounter()) {
            System.out.println("Same logger was used for all messages.");
        }
    }
}
