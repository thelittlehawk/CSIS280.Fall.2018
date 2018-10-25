package ba.edu.ssst;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number = s.nextInt();

        switch (number) {
            case 5:
                System.out.println("5");
            case 10:
                System.out.println("10");
                break;
            default:
                System.out.println("!10");
        }
    }
}
