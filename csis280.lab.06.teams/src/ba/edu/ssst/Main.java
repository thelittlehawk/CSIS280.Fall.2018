package ba.edu.ssst;

import com.sun.javafx.binding.StringFormatter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    try {
            // Open file
            File file = new File("team.members.txt");

            // Create scanner for reading lines from file
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] elements = line.split(",");

                if(elements.length == 4) {
                    String firstName = elements[0].trim();
                    String lastName = elements[1].trim();
                    String teamName = elements[2].trim();
                    Boolean isCaptain = Boolean.parseBoolean(elements[3].trim());
                    TeamMember teamMember = new TeamMember(firstName, lastName, isCaptain);

                    boolean hasTeam = false;
                    for (Team team : Storage.getInstance().teams) {
                        if (team.getName().equals(teamName)) {
                            hasTeam = true;
                            break;
                        }
                    }

                    if (!hasTeam) {
                        Storage.getInstance().teams.add(new Team(teamName));
                    }

                    for (Team team: Storage.getInstance().teams) {
                        if(team.getName().equals(teamName)) {
                            team.addTeamMember(teamMember);
                        }
                    }
                }
            }
            for (Team team: Storage.getInstance().teams) {
                System.out.println(String.format("Team %s has following members:", team.getName()));
                for (TeamMember member: team.getTeamMembers()) {
                    System.out.println(member);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
