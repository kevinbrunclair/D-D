package enemy;

public class Dragon extends Enemy {

    public Dragon() {
        super("Dragon", 4, 15);
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", lifepoints=" + lifepoints +
                ", attackpoints=" + attackpoints +
                '}';
    }
}

