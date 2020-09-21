package methods;

public class EgenKvadratrod {
    public static void main(String[] args) {
        for (double i = 0.000000001; i <= 1; i += 0.000000001) {
            System.out.println(sqrt(i));
        }
    }

    public static double sqrt(double a) {
        return Math.sqrt(a);
    }
}
