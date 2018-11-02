package ba.edu.ssst;

public class MasterStudent extends Person {
    public MasterStudent(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String getMentorName() {
        return "No menotr yet";
    }

    @Override
    public String toString() {
        return "Master Student";
    }
}
