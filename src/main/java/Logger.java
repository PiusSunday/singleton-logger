public class Logger {
    // Private static instance of the logger
    private static Logger instance;

    // Private constructor to prevent external instantiation
    private Logger() {
        // Initialization code, if any
    }

    // Static method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    // Logging method
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
