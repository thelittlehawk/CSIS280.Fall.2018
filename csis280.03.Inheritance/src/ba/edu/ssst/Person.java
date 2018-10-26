package ba.edu.ssst;

public class Person {

    private String firstName;

    private String lastName;

    private String dateOfBirth;

//    public Person() {
//        this.firstName = "";
//        this.lastName = "";
//        this.dateOfBirth = "Unknown";
//    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = "Unknown";
    }

    public Person(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + " [" + this.getDateOfBirth() + "]";
    }
}
