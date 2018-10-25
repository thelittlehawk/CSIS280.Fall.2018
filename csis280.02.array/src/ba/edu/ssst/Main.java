package ba.edu.ssst;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> erej = new ArrayList<Integer>();
        erej.add(100);
        erej.add(10);
        erej.add(1);

        // Remove element
        erej.remove(2);

        // Change value
        erej.set(0, 50);

        for (Integer i: erej) {
            System.out.println(i);
        }

        Object o = new Object();
        System.out.println(o.toString());
        System.out.println(o.hashCode());

        System.out.println(erej);
    }
}
