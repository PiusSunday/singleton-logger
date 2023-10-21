public class Main {
    public static void main(String[] args) {
        // Get the logger instance
        Logger logger = Logger.getInstance();

        // Log some messages
        logger.log("This is a log message.");
        logger.log("Another log message.");

        // Even if we try to create another instance, it's the same instance
        Logger anotherLogger = Logger.getInstance();

        System.out.println(logger == anotherLogger); // Outputs true
    }
}
