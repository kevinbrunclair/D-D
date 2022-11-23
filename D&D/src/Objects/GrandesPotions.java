package Objects;

public class GrandesPotions extends Potion {

    public GrandesPotions() {
        super("Grandepotion",5);
    }

    @Override
    public String toString() {
        return "GrandesPotions{" +
                "name='" + name + '\'' +
                ", healpoints=" + healpoints +
                '}';
    }

}

