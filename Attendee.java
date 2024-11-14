public class Attendee extends Person {
    // Member Variables
    private Integer groupNo;

    // Constructors
    public Attendee() {
        super();
        this.groupNo = 0;
    }

    public Attendee(Integer groupNo) {
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
}
