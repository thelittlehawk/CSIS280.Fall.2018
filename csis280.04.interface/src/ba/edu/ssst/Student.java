package ba.edu.ssst;

public class Student implements IStudent {

    private final int points;

    public Student(int points) {
        this.points = points;
    }

    @Override
    public int getPoints() {
        return this.points;
    }

    @Override
    public String getMentorName() {
        return "--";
    }
}
