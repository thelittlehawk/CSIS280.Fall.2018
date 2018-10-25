package ba.edu.ssst;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.print("Enter number: ");
	    Scanner s = new Scanner(System.in);

	    int number = s.nextInt();

        if (number % 2 == 0 && number % 5 == 0) {
            System.out.println(number);
        } else {
            System.out.println("! % [2, 5]");
        }

	    if (number % 2 == 0 || number % 5 == 0) {
	        System.out.println(number);
        } else {
            System.out.println("! % [2, 5]");
        }
    }
}
