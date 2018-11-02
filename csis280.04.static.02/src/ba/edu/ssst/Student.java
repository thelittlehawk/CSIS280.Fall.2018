package ba.edu.ssst;

public class Student {

    private final String lastName;

    private final String firstName;

    private final int points;

    public Student(String firstName, String lastName, int points) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = points;
    }

    public int getPoints() {
        return this.points;
    }
}
