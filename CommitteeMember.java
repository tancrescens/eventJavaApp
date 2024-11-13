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

}