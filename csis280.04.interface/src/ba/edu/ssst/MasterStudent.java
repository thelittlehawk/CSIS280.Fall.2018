package ba.edu.ssst;

public class MasterStudent implements IStudent {

    private final int points;

    private final String mentorName;

    public MasterStudent(int points, String mentorName) {
        this.points = points;
        this.mentorName = mentorName;
    }

    @Override
    public int getPoints() {
        return this.points;
    }

    @Override
    public String getMentorName() {
        return this.mentorName;
    }
}
