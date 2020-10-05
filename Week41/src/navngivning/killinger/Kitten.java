package navngivning.killinger;

public class Kitten {
    public static int count = 0;

    private double cuteness;

    public Kitten (double cuteness) {
        this.cuteness = cuteness;
        count++;
    }
}
