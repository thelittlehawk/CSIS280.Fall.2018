package ba.edu.ssst;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> errej = new ArrayList<>();

        Random r = new Random();

        for(int i = 0 ; i < 100 ; i++) {
            errej.add(r.nextInt(100));
        }

        Collections.sort(errej);

        errej.forEach((value) -> System.out.println(value));
    }
}
