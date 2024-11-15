import java.util.Scanner;

public class CommitteeMember extends Person {
    // Member variables
    private String taskforce;

    // Constructors
    public CommitteeMember() {
        super();
        this.taskforce = "N/A";
    }

    public CommitteeMember(String firstname, String lastname, String icNo, String taskforce) {
        super(firstname, lastname, icNo);
        this.taskforce = taskforce;
    }

    // Setters and Getters
    public String getTaskforce() {
        return taskforce;
    }

    public void setTaskforce(String taskforce) {
        this.taskforce = taskforce;
    }

    // Methods
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Taskforce: " + getTaskforce());
    }

    @Override
    public void edit(Scanner sc) {
        super.edit(sc);
        System.out.println("Enter the new taskforce or press [ENTER] to retain original taskforce");
        String taskforce = sc.nextLine();
        setTaskforce(taskforce.length() > 0 ? taskforce : this.taskforce);
    }
}