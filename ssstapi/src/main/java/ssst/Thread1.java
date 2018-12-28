package ssst;

public class Thread1 implements Runnable {

    String name;

    public Thread1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name);
    }
}
