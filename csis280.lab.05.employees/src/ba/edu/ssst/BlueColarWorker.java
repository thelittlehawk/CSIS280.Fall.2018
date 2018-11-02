package ba.edu.ssst;

public class BlueColarWorker implements IEmployee {
    private final double salary;

    private final int freeDays;

    public BlueColarWorker(double salary , int freeDays) {
        this.salary = salary;
        this.freeDays = freeDays;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public double getEarnings() {
        return this.getSalary();
    }

    @Override
    public int numberOfFreeDays() {
        return this.freeDays;
    }
}
