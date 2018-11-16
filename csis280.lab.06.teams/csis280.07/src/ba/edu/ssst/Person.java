package ba.edu.ssst;

public class Person {
    private final String name;

    private Integer num;

    public Person(String tempName) {
        this.name = tempName;
        this.num = 1;
    }

    public String getName() {
        return name;
    }

    public void addNum() {
        this.num++;
    }

    @Override
    public String toString() {
        return this.num + "";
    }
}
