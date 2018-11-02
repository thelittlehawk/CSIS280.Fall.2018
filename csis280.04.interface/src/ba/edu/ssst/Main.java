package ba.edu.ssst;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<IStudent> students = new ArrayList();
        students.add(new Student(10));
        students.add(new MasterStudent(20, "No mentor"));
        students.add(new Student(60));
        students.add(new MasterStudent(40, "Test mentor"));
        students.add(new Student(980));
        students.add(new MasterStudent(10, "Notest mentor"));

        for (IStudent s: students) {
            System.out.println(s.getPoints() + " Mentor(" + s.getMentorName() + ")");
        }
    }
}
