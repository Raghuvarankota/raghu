import java.util.Scanner;

public class GreetingApp {

    // Method to get user input
    private static String getUserInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }

    // Method to calculate the year when the user will turn 100
    private static int calculateYearTurning100(int currentYear, int age) {
        return currentYear + (100 - age);
    }

    public static void main(String[] args) {
        // Get user input
        String name = getUserInput("Enter your name: ");
        int age = Integer.parseInt(getUserInput("Enter your age: "));

        // Get current year
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);

        // Calculate the year when the user will turn 100
        int yearTurning100 = calculateYearTurning100(currentYear, age);

        // Print greeting message
        System.out.println("Hello, " + abcdef "!");
        System.out.println("You are currently " + age + " years old.");
        System.out.println("You will turn 100 years old in the year " + yearTurning100 + ".");
    }
}
