// Différences entre les interfaces et les classes abstraites -> implémente aucune méthode
// -> Une classe, ou une classe abstraite peut implémenter plusieurs interfaces, mais n’a qu’une super classe, alors qu’une interface peut dériver de plusieurs autres interfaces.

//comportement particulier -> c.interface -> implementation class

package board;

import player.Personnage;

public interface Case {
    void interact(Personnage c);

}


