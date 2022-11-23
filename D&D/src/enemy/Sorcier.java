package enemy;

public class Sorcier  extends Enemy {

    public Sorcier() {
        super("Sorcier",2,9);

    }

    public Sorcier(String name, int attack, int life) {
        super(name, attack, life);
    }

    @Override
    public String toString() {
        return "Sorcier{" +
                "name='" + name + '\'' +
                ", lifepoints=" + lifepoints +
                ", attackpoints=" + attackpoints +
                '}';

    }

}