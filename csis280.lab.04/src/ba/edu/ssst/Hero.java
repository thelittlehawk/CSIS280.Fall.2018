package ba.edu.ssst;

public class Hero {
    private final String name;

    private int health;

    private final int damage;

    public Hero(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void receiveDamage(int inputDamage) {
        if (health % 2 == 0 && inputDamage % 2 == 0) {
            health -= inputDamage;
        }
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }
}
