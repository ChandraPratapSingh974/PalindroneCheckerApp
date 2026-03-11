package App.src;

public class PalindromeCheckerApp {

    // Application metadata
    private static final String APP_NAME = "Palindrome Checker App";
    private static final String APP_VERSION = "1.0";

    // Entry point of the application
    public static void main(String[] args) {
        displayWelcomeMessage();

        // Here you can continue to the next use case or exit
        System.out.println("Ready to start palindrome checks...\n");
    }

    /**
     * Displays the welcome message and application information.
     */
    private static void displayWelcomeMessage() {
        System.out.println("====================================");
        System.out.println("       Welcome to " + APP_NAME);
        System.out.println("       Version: " + APP_VERSION);
        System.out.println("====================================\n");
    }
}