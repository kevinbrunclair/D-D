import board.Board;
import game.Game;
import singleton.Dbaccess;
//import game;


// Le Singleton est un patron de conception de création qui s’assure de l’existence d’un seul objet de son genre et fournit un unique point d’accès vers cet objet.

public class Main {


    public static void main(String[] args) {

        Dbaccess connection = Dbaccess.getInstance();
        connection.getHeros();
        Game game = new Game();
        game.myGame();
        Board test = new Board(true);



    }
}

