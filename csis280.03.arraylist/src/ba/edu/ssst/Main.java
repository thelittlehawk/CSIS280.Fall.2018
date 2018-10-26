package ba.edu.ssst;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Grade Book");

	    GradeBook gradeBook = new GradeBook();

        Scanner scanner = new Scanner(System.in);
        int inputGrade = scanner.nextInt();
        while(inputGrade != 0) {
            Grade grade = new Grade(inputGrade);
            gradeBook.add(grade);
            inputGrade = scanner.nextInt();
        }

        gradeBook.report();
    }
}
