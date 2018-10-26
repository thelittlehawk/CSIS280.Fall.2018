package ba.edu.ssst;

import java.util.ArrayList;

public class GradeBook {
    private ArrayList<Grade> grades;

    public GradeBook() {
        grades = new ArrayList<>();
    }

    public void add(Grade grade) {
        grades.add(grade);
    }

    public void report() {
        System.out.println("GradeBook Report");
        System.out.println("Number of grade " + grades.size());
        System.out.println("Min grade is " + this.min());
        System.out.println("Max grade is " + this.max());
        System.out.println("Avg grade is " + this.avg());
    }

    public float avg() {
        float sum = 0;
        for (Grade tempGrade: grades) {
            sum += tempGrade.get();
        }
        return sum / grades.size();
    }

    public Grade max() {
        Grade maxGrade = grades.get(0);
        for (Grade tempGrade: grades) {
            if (tempGrade.get() > maxGrade.get()) {
                maxGrade = tempGrade;
            }
        }
        return maxGrade;
    }

    public Grade min() {
        Grade minGrade = grades.get(0);
        for (Grade tempGrade: grades) {
            if (tempGrade.get() < minGrade.get()) {
                minGrade = tempGrade;
            }
        }
        return minGrade;
    }
}
