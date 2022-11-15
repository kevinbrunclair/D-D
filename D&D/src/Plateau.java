public class Plateau {

    int nbCases;

    public Plateau(int nbCases){
        this.nbCases = nbCases;
    }

    public void showBoardGame(int position){
        for (int i = 0; i < nbCases; i++) {
            if (i == position){
                System.out.print("[X]");
            } else {
                System.out.print("[]");
            }
        }
    }

    public void move(int position){
        showBoardGame(position);
    }

}
