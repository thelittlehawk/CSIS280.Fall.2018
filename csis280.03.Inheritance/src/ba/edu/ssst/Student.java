package ba.edu.ssst;

public class Student extends Person {

    private int year;

    public Student(String firstName, String lastName, int year) {
        super(firstName, lastName);
        this.year = year;
    }

    public Boolean willPass() {
        return false;
    }

    public int getYear() {
        return year;
    }
}
