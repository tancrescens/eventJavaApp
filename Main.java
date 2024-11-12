import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaring the number list (for ) and scanner
        Scanner sc = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = makeAChoice(sc, 1, 3);

            // implement the other options
            if (choice == 1) {
                attendeeMenu();
                int attendeeChoice = makeAChoice(sc, 1, 4);
                if (attendeeChoice == 1) {

                }
                if (attendeeChoice == 2) {

                }
                if (attendeeChoice == 3) {

                }
                if (attendeeChoice == 4) {

                }

            }
            if (choice == 2) {
                committeeMenu();
                int attendeeChoice = makeAChoice(sc, 1, 4);
                if (attendeeChoice == 1) {

                }
                if (attendeeChoice == 2) {

                }
                if (attendeeChoice == 3) {

                }
                if (attendeeChoice == 4) {

                }

            }
            if (choice == 3) {
                break;
            }
        }
        System.out.println("Goodbye!");
    }

    // Main Menu
    public static void displayMenu() {
        System.out.println("");
        System.out.println("====================");
        System.out.println("1. Attendee Menu");
        System.out.println("2. Event Committee Menu");
        System.out.println("3. Exit program");
    }

    // make a choice function
    public static Integer makeAChoice(Scanner sc, int lowerBound, int upperBound) {
        int choice;
        while (true) {
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            // clear the keyboard buffer to get rid of the \n in there
            sc.nextLine();
            System.out.println("Your choice: " + choice);
            if (choice >= lowerBound && choice <= upperBound) {
                System.out.println("");
                break;
            } else {
                System.out.println("Please enter between " + lowerBound + " to " + upperBound);
            }
        }
        return choice;
    }

    // 1: Display attendee menu
    public static void attendeeMenu() {
        System.out.println("====================");
        System.out.println("1. Get list of all numbers");
        System.out.println("2. Get the mean of all the numbers");
        System.out.println("3. Get the median of all the numbers");
        System.out.println("4. Get the mode (highest frequency) of all the numbers");
    }

    // 2: Display Event committee menu
    public static void committeeMenu() {
        System.out.println("====================");
        System.out.println("1. Get list of all numbers");
        System.out.println("2. Get the mean of all the numbers");
        System.out.println("3. Get the median of all the numbers");
        System.out.println("4. Get the mode (highest frequency) of all the numbers");
    }

    // 3: Option 3: Exit menu is in main
}
