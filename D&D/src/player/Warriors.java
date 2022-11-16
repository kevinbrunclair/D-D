package player;


public class Warriors extends Character {

    public Warriors(String name) {
        super(name);
        this.setLifepoints(10);
        this.setAttackpoints(10);
//        this.weaponO = weaponoff.getName();
//        this.weaponD = weapondef.getName();
    }

    @Override
    public String toString() {
        return "Warriors {" +
                "name='" + name + '\'' +
                ", lifepoints=" + lifepoints +
                ", attackpoints=" + attackpoints +
                ", weapon=" +
                ", protection=" +
                '}';
    }

}
