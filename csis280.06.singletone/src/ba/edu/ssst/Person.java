package ba.edu.ssst;

import java.io.File;

public class Person {
    private final String firstName;

    private final String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
