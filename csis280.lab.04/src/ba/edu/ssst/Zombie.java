package ba.edu.ssst;

public class Zombie extends Creature {
    public Zombie(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void receiveDamage(int inputDamage) {
        if(inputDamage % 11 == 0) {
            super.receiveDamage(2 * inputDamage);
        }
    }
}
