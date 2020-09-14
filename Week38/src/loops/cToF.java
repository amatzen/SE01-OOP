package loops;

public class cToF {
    public static void main(String[] args) {

        System.out.printf("°C    | °F    \n");
        for (float d = -5f; d <= 40f; d += 0.5f) {
            float conversion = d * 1.8f + 32.00f;
            System.out.printf("%3.2f °C | %3.2f °F\n", d, conversion);
        }

    }
}
