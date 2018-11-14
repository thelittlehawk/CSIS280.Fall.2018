package ba.edu.ssst;

import java.util.ArrayList;

public class Team {

    private final ArrayList<TeamMember> members;

    private final String name;

    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public void addTeamMember(TeamMember member) {
        this.members.add(member);
    }

    public String getName() {
        return name;
    }

    public ArrayList<TeamMember> getTeamMembers() {
        return members;
    }
}
