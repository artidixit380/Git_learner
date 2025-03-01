import java.util.Scanner;

public class GreetingApp {

    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Print a greeting message
        System.out.println("Hello, " + name + "! Welcome to the Java Application.");

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
