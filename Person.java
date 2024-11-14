public abstract class Person {
    // Member Variables
    protected String firstname;
    protected String lastname;
    protected String icNo;

    // Constructors
    public Person() {
        this.firstname = "N/A";
        this.lastname = "N/A";
        this.icNo = "N/A";
    }

    public Person(String firstname, String lastname, String icNo) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.icNo = icNo;
    }

    // Setters and Getters
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getIcNo() {
        return icNo;
    }

    public void setIcNo(String icNo) {
        this.icNo = icNo;
    }

    // Methods
    public void displayDetails() {
        System.out.println("Name: " + getFirstname() + " " + getLastname());
        System.out.println("IC Number: " + getIcNo());
    }

}
