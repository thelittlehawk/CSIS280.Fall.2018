package ba.edu.ssst;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student s1 = new Student("Super", "Student");
        students.add(s1);
        students.add(new Student("Not so Super", "Student"));

        ArrayList<Student> students2 = new ArrayList<>();
        students2.addAll(students);

        System.out.println(students);
        System.out.println(students.size());
    }
}
