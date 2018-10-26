package ba.edu.ssst;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Person p = new Person("Random", "Person", "1/1/2018");

        Student s = new Student("Random", "Student", 1);

        Person student = new Student("Random 2", "Student 2", 2);

        ArrayList<Person> members = new ArrayList<>();
        members.add(new Person("", "", ""));
        members.add(new Student("", "", 2));
        members.add(new Employee());

        System.out.println("Person: " + p);
        System.out.println("Student: " + s);
        System.out.println("Will pass: " + s.willPass());
    }
}
