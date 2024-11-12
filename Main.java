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
                int attendeeChoice = makeAChoice(sc, 1, 3);
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
                int attendeeChoice = makeAChoice(sc, 1, 6);
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
        System.out.println("Main Menu");
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

    // 1: Display Event committee menu
    public static void committeeMenu() {
        System.out.println("");
        System.out.println("Event Committee Menu");
        System.out.println("====================");
        System.out.println("1. Get list of attendees");
        System.out.println("2. Create an attendee profile");
        System.out.println("3. Edit attendee's details");
        System.out.println("4. Delete attendee profile");
        System.out.println("5. Collate all attendees and committee members for insurance coverage");
        System.out.println("6. Back to main menu");

    }

    // 2: Display attendee menu
    public static void attendeeMenu() {
        System.out.println("");
        System.out.println("Attendee Menu");
        System.out.println("====================");
        System.out.println("1. Get my details");
        System.out.println("2. Edit my details");
        System.out.println("3. Back to main menu");
    }

    // 3: Option 3: Exit menu is in main
}
