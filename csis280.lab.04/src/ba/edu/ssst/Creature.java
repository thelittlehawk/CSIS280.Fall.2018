package ba.edu.ssst;

public class Creature {
    private final String name;

    protected int health;

    private final int damage;

    public Creature(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void receiveDamage(int inputDamage) {
        health -= inputDamage;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }
}
