package board;

import player.Personnage;

public class EmptyCase implements Case {

    @Override
    public void interact(Personnage c) {
        System.out.println("Nothing to see here");

    }

}
