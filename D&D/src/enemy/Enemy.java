package enemy;

import board.Case;
import player.Personnage;
import menu.Menu;


public class Enemy extends Personnage implements Case {

    public Enemy(int name) {
        super(name);
    }

    public Enemy(String name, int attack, int pv) {
        super(name, attack, pv);
    }


    public String toString() {
        return "Enemy" +
                "name='" + name + '\'' +
                ", lifepoints=" + lifepoints +
                ", attackpoints=" + attackpoints +
                '}';
    }

    @Override
    public void interact(Personnage c) {
        System.out.println(ANSI_RED + "Vous avez rencontré un " + name + ANSI_RESET);

        while (lifepoints > 0) {
            String choice = Menu.nowFight();
            if (choice.equals("1")) {

                int damagetoennemy = c.getAttackpoints(); // calcul des dégats infligés à l'ennemi
                lifepoints = lifepoints - damagetoennemy; // soustrait les dégats infligés à l'ennemi
                int damagetoplayer = attackpoints; // calcul des dégats infligés au joueur
                System.out.println(ANSI_YELLOW + "Vous attaquez le " + name + " et lui infligez " + damagetoennemy + " points de dégats" + ANSI_RESET); // affiche les dégats infligés à l'ennemi
                System.out.println(ANSI_RED + "Il lui reste " + lifepoints + " points de vie" + ANSI_RESET); // affiche les points de vie restants à l'ennemi
                c.setLifepoints(c.getLifepoints() - attackpoints); // soustrait les dégats infligés au joueur
                System.out.println(ANSI_RED + name + " vous attaque et vous inflige " + damagetoplayer + " points de dégats" + ANSI_RESET); // affiche les dégats infligés au joueur
                System.out.println(ANSI_YELLOW + "Il vous reste " + c.getLifepoints() + " points de vie" + ANSI_RESET); // affiche les points de vie restants au joueur

                if (lifepoints <= 0) {
                    System.out.println(ANSI_PURPLE + "Vous avez tué le " + name + ANSI_RESET);
                }
            } else if (choice.equals("2")) {
                // En cas de fuite, vous reculez d’un nombre de cases aléatoires (entre 1 et 6)

                System.out.println(ANSI_RED + "Vous avez fuit le combat" + ANSI_RESET);
                int dice2 = (int) (Math.random() * 6 + 1);
                System.out.println(ANSI_CYAN + "Vous reculez de " + dice2 + " cases" + ANSI_RESET);
                c.setPosition(c.getPosition() - dice2);
                if (c.getPosition() <= 0) {
                    c.setPosition(0);
                }
                break;
            }

        }
    }


    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_PURPLE = "\u001B[35m";

    public static final String ANSI_YELLOW = "\u001B[33m";

    public static final String ANSI_CYAN = "\u001B[36m";
}
