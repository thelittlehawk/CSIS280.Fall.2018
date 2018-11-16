package ba.edu.ssst;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>();
//        Map<String, Integer> map = new TreeMap<>();
        Map<String, Person> map = new LinkedHashMap<>();

        try {
            File file = new File("names.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String tempName = scanner.nextLine();

                Person p = new Person(tempName);

                if(map.containsKey(p.getName())) {
                    Person person = map.get(p.getName());
                    person.addNum();
                    map.put(p.getName(), person);
                } else {
                    map.put(p.getName(), p);
                }
            }

            System.out.println("HashMap outputting to a file...");
            PrintWriter pw = new PrintWriter("linked_output.txt");
            map.forEach((key, value) -> pw.println(key + " : " + value));
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        HashMap
//        TreeMap
//        LinkedHashMap
    }
}
