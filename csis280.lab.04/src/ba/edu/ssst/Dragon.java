package ba.edu.ssst;

public class Dragon extends Creature {
    public Dragon(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void receiveDamage(int inputDamage) {
        if(inputDamage % 2 == 0 && inputDamage % 3 == 0) {
            health -= inputDamage;
        }
    }
}
