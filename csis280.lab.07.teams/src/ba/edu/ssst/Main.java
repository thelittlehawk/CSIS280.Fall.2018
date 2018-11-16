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

                    if(Storage.getInstance().teams.containsKey(teamName)) {
                        ArrayList<TeamMember> teamMembers = Storage.getInstance().teams.get(teamName);
                        teamMembers.add(teamMember);
                        Storage.getInstance().teams.put(teamName, teamMembers);
                    } else {
                        ArrayList<TeamMember> teamMembers = new ArrayList<>();
                        teamMembers.add(teamMember);
                        Storage.getInstance().teams.put(teamName, teamMembers);
                    }
                }
            }
            Storage.getInstance().teams.forEach((teamName, members) -> {
                System.out.println(String.format("Team %s has following members:", teamName));
                for (TeamMember member: members) {
                    System.out.println(member);
                }
                System.out.println("========================================");
            });
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
