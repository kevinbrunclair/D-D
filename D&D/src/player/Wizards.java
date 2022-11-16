package player;

public class Wizards extends Character {

    public Wizards(String name) {
        super(name);
        this.setLifepoints(6);
        this.setAttackpoints(15);
//        this.weaponO = weaponoff.getNameWizard();
//        this.weaponD = weapondef.getNameWizard();
    }

    @Override
    public String toString() {
        return "Wizards {" +
                "name='" + name + '\'' +
                ", lifepoints=" + lifepoints +
                ", attackpoints=" + attackpoints +
                ", weapon=" +
                ", protection=" +
                '}';
    }
}
