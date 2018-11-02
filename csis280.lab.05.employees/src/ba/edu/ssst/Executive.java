package ba.edu.ssst;

public class Executive implements IEmployee {
    private final int numberOfEmployees;

    private final double salary;

    private final int freeDays;

    public Executive(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
        this.salary = 0;
        this.freeDays= 0;
    }

    private double getBonus() {
        return this.numberOfEmployees * 500;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public double getEarnings() {
        return this.getSalary() + this.getBonus();
    }

    @Override
    public int numberOfFreeDays() {
        return this.freeDays;
    }
}
