package Objects;

public class GrandePotion extends Potion {

    public GrandePotion() {
        super("Grandepotion",1);
    }

    @Override
    public String toString() {
        return "GrandesPotions{" +
                "name='" + name + '\'' +
                ", healpoints=" + pvrendu +
                '}';
    }

}

