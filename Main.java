import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaring the number list (for ) and scanner
        Scanner sc = new Scanner(System.in);

        // Main menu
        while (true) {
            displayMenu();
            int choice = makeAChoice(sc, 1, 3);

            // Main Menu option 1: Committee Member Menu
            if (choice == 1) {
                while (true) {
                    committeeMenu();
                    int committeeChoice = makeAChoice(sc, 1, 6);

                    if (committeeChoice == 1) {
                        getAttendeeList();
                    }
                    if (committeeChoice == 2) {
                        createAttendeeProfile();
                    }
                    if (committeeChoice == 3) {
                        editAttendeeProfile();
                    }
                    if (committeeChoice == 4) {
                        deleteAttendeeProfile();
                    }
                    if (committeeChoice == 5) {
                        insuranceCoverageList();
                    }
                    if (committeeChoice == 6) {
                        break;
                    }
                }

            }
            // Main Menu option 2: Attendee Menu
            if (choice == 2) {
                while (true) {
                    attendeeMenu();
                    int attendeeChoice = makeAChoice(sc, 1, 3);
                    // Attendee Menu

                    if (attendeeChoice == 1) {
                        getAttendeeProfile();
                    }
                    if (attendeeChoice == 2) {
                        editAttendeeProfile();
                    }
                    if (attendeeChoice == 3) {
                        break;
                    }
                }
            }
            // Main Menu option 3: Exit Main Menu
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
        System.out.println("1. Event Committee Menu");
        System.out.println("2. Attendee Menu");
        System.out.println("3. Exit program");
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

    // 1.1: Get list of attendees
    public static void getAttendeeList() {
        System.out.println("getAttendeeList()");
    }

    // 1.2: Create an attendee profile
    public static void createAttendeeProfile() {
        System.out.println("createAttendee()");
    }

    // 1.3: Edit attendee's details
    public static void editAttendeeProfile() {
        System.out.println("editAttendee()");
    }

    // 1.4: Delete attendee profile
    public static void deleteAttendeeProfile() {
        System.out.println("deleteAttendee()");
    }

    // 1.5: Collate all attendees and committee members for insurance coverage
    public static void insuranceCoverageList() {
        System.out.println("insuranceCoverageList(): Attendees and Committee implements insurance coverage()");
    }
    // 1.6: Exit to main menu is in main();

    // 2: Display attendee menu
    public static void attendeeMenu() {
        System.out.println("");
        System.out.println("Attendee Menu");
        System.out.println("====================");
        System.out.println("1. Get my profile");
        System.out.println("2. Edit my profile");
        System.out.println("3. Back to main menu");
    }

    // 2.1: Get list of attendees
    public static void getAttendeeProfile() {
        System.out.println("getAttendeeList()");
    }

    // 2.2: Get list of attendees
    // Declared above

    // 3: Option 3: Exit to main menu is in main()

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
}
