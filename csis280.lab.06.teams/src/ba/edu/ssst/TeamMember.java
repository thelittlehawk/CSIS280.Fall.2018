package ba.edu.ssst;

public class TeamMember {
    private final String firstName;

    private final String lastName;

    private final boolean captain;

    public TeamMember(String firstName, String lastName, boolean captain) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.captain = captain;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isCaptain() {
        return captain;
    }

    @Override
    public String toString() {
        return firstName + ", " + lastName + (captain ? " is CAPTAIN" : "");
    }
}
