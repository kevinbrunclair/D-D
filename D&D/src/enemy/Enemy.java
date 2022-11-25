package enemy;

import board.Case;
import player.Personnage;


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

        System.out.println(ANSI_RED + "Vous avez rencontré un " + name + ANSI_RESET); // affiche le nom de l'ennemi

        int damagetoennemy = c.getAttackpoints(); // calcul des dégats infligés à l'ennemi
        lifepoints = lifepoints - damagetoennemy; // soustrait les dégats infligés à l'ennemi

        System.out.println(ANSI_YELLOW + "Vous attaquez le " + name + " et lui infligez " + damagetoennemy + " points de dégats" + ANSI_RESET); // affiche les dégats infligés à l'ennemi
        System.out.println(ANSI_RED + "Il lui reste " + lifepoints + " points de vie" + ANSI_RESET); // affiche les points de vie restants à l'ennemi

        int damagetoplayer = attackpoints; // calcul des dégats infligés au joueur
        c.setLifepoints(c.getLifepoints() - attackpoints); // soustrait les dégats infligés au joueur
        System.out.println(ANSI_RED + name + " vous attaque et vous inflige " + damagetoplayer + " points de dégats" + ANSI_RESET); // affiche les dégats infligés au joueur
        System.out.println(ANSI_YELLOW + "Il vous reste " + c.getLifepoints() + " points de vie" + ANSI_RESET); // affiche les points de vie restants au joueur

        // Si le niveau de vie de l’ennemi atteint 0, ce dernier meurt.
        if (lifepoints <= 0) {
            System.out.println(ANSI_PURPLE + "Vous avez tué le " + name + ANSI_RESET);
        } else {
            System.out.println( name + " a pris la fuite ");
        }
    }

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_PURPLE = "\u001B[35m";

    public static final String ANSI_YELLOW = "\u001B[33m";
}
