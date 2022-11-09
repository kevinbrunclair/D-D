import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in); //

    public void MainMenu() {
        System.out.println("Welcome to the DnD game!");
        System.out.println("1. Play");
        System.out.println("2. Quit");
    }

    public void NewCharacter() {
        System.out.println("Please choose the type of character you want to create :");
        System.out.println("1. Warrior");
        System.out.println("2. Wizard");
    }

    public void CreateWarrior() {
        System.out.println("Please enter the name of your warrior:");
        String name = sc.nextLine();
    }

    public void CreateWizard() {
        System.out.println("Please enter the name of your wizard :");
        String name = sc.nextLine();
    }
}





