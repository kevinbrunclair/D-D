package Objects;

import stuff.Weapon;

public class Epee extends Weapon {

    public Epee() {
        super("épee",5);
    }

    @Override
    public String toString() {
        return "Epee{" +
                "name='" + name + '\'' +
                ", attackpoints=" + attackpoints +
                '}';
    }

}

