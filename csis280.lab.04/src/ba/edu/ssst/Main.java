package ba.edu.ssst;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Creature> creatures = new ArrayList<>();

        Dragon red = new Dragon("Red", 100, 40);
        creatures.add(red);

        creatures.add(new Dragon("Green", 50, 70));
        creatures.add(new Zombie("Zoomie", 20, 10));
        creatures.add(new Zombie("Zoomy", 20, 10));
        creatures.add(new Zombie("Zoomer", 20, 10));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hero name: ");
        String heroName = scanner.nextLine();
        System.out.println("Hero health: ");
        int heroHealth = scanner.nextInt();
        System.out.println("Hero damage: ");
        int heroDamage = scanner.nextInt();

        Hero hero = new Hero(heroName, heroHealth, heroDamage);

        boolean creaturesAlive;
        do {
            // Hero -> Creatures
            for (Creature creature : creatures) {
                creature.receiveDamage(hero.getDamage());
            }
            // Creatures -> Hero
            for (Creature creature : creatures) {
                hero.receiveDamage(creature.getDamage());
            }

            System.out.println(hero.getName() + " is alive, " + hero.isAlive());
            for (Creature creature : creatures) {
                System.out.println(creature.getName() + " is alive, " + creature.isAlive());
            }

            creaturesAlive = false;
            for (Creature creature : creatures) {
                creaturesAlive = creaturesAlive || creature.isAlive();
            }
        } while (hero.isAlive() && creaturesAlive);
    }
}
