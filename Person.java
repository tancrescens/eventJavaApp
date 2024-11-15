import java.util.Scanner;

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

    public void edit(Scanner sc) {
        System.out.println("Enter the new first name or press [ENTER] to retain original first name");
        String firstname = sc.nextLine();
        setFirstname(firstname.length() > 0 ? firstname : this.firstname);

        System.out.println("Enter the new last name or press [ENTER] to retain original last name");
        String lastname = sc.nextLine();
        setLastname(lastname.length() > 0 ? lastname : this.lastname);

        System.out.println("Enter the new IC Number or press [ENTER] to retain original IC Number");
        String icNo = sc.nextLine();
        setIcNo(icNo.length() > 0 ? icNo : this.icNo);
    }

}
