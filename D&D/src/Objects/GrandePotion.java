package Objects;

public class GrandePotion extends Potion {

    public GrandePotion() {
        super("Grandepotion",5);
    }

    @Override
    public String toString() {
        return "GrandesPotions{" +
                "name='" + name + '\'' +
                ", healpoints=" + pvrendu +
                '}';
    }

}

