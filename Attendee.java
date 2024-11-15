import java.util.Scanner;

public class Attendee extends Person {
    // Member Variables
    private Integer groupNo;

    // Constructors
    public Attendee() {
        super();
        this.groupNo = 0;
    }

    public Attendee(String firstname, String lastname, String icNo, Integer groupNo) {
        super(firstname, lastname, icNo);
        this.groupNo = groupNo;
    }

    // Setters and Getters
    public Integer getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(Integer groupNo) {
        this.groupNo = groupNo;
    }

    // Methods
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Group Number: " + getGroupNo());
    }

    @Override
    public void edit(Scanner sc) {
        super.edit(sc);
        System.out.println("Enter the new group number or press [ENTER] to retain original group number");
        String input = sc.nextLine();
        if (!input.isEmpty()) { // Check if input is not empty
            try {
                int groupNo = Integer.parseInt(input); // Parse the input to an integer
                setGroupNo(groupNo); // Update the group number
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Group number not updated.");
            }
        }
    }

}
