package board;

public class Board {

    int nbCases = 64;

    public Board(int nbCases){
        this.nbCases = nbCases;
    }

    public int getNbCases() {
        return nbCases;
    }

    public void setNbCases(int nbCases) {
        this.nbCases = nbCases;
    }
}
