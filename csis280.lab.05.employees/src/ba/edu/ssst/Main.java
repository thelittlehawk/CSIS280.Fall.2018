package ba.edu.ssst;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<IEmployee> employees = new ArrayList<>();

        employees.add(new BlueColarWorker(850, 25));
        employees.add(new BlueColarWorker(900, 25));
        employees.add(new BlueColarWorker(1000, 25));
        employees.add(new BlueColarWorker(1100, 25));
        employees.add(new BlueColarWorker(1200, 25));

        employees.add(new Manager(1400, 18, 3));
        employees.add(new Manager(1500, 19, 5));
        employees.add(new Manager(1700, 20, 6));

        employees.add(new Executive(30));

        // Average salary
        double totalSalary = 0;
        for (IEmployee e : employees) {
            totalSalary += e.getSalary();
        }
        System.out.println("Average salary : " + totalSalary / employees.size());

        // Average manager salary
        double totalManagerSalary = 0;
        int numberOfManagers = 0;
        for (IEmployee e : employees) {
            if (e.getClass() == Manager.class) {
                totalManagerSalary += e.getSalary();
                numberOfManagers++;
            }
        }
        System.out.println("Average salary : " + totalManagerSalary / numberOfManagers);

        double min = employees.get(0).getEarnings();
        for (IEmployee e : employees) {
            if ( e.getEarnings() < min ) {
                min = e.getEarnings();
            }
        }
        System.out.println("Min earning s: " + min);

        double max = employees.get(0).getEarnings();
        for (IEmployee e : employees) {
            if ( e.getEarnings() > max ) {
                max = e.getEarnings();
            }
        }
        System.out.println("Min earning s: " + max);
    }
}
