package ba.edu.ssst;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    System.out.println("Reading from file");
		System.out.println("==================");

        // File fileWindows = new File("C:\\Users\\faik\\Desktop\\input.txt");
        // File fileMac = new File("/Users/faik/Dekstop/input.txt");
	    File file = new File("input.txt");

		ArrayList<String> names = new ArrayList<>();
		try {
			Scanner s = new Scanner(file);
			while(s.hasNextLine()) {
				String name = s.nextLine();
				names.add(name);
			}
		} catch (FileNotFoundException e) {
			System.out.println("No file");
		} catch (Exception e) {
			System.out.println("Unknown exception");
		}

		for (String name: names) {
			System.out.println(name);
		}
    }
}
