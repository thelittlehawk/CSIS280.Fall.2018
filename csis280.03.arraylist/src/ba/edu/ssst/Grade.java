package ba.edu.ssst;

public class Grade {
    private final int inputGrade;

    public Grade(int inputGrade) {
        this.inputGrade = inputGrade;
    }

    public int get() {
        return inputGrade;
    }

    @Override
    public String toString() {
        return inputGrade + "";
    }
}
