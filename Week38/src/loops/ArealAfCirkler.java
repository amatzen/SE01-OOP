package loops;

public class ArealAfCirkler {
    public static void main(String[] args) {
        // Taget fra min udarbejdelse i uge 37
        // https://github.com/amatzen/SE01-OOP/blob/master/Week37/src/dk/alexander/ovelser/week37/Main.java

        double[] data = {1, 3, 5};
        double pi = 3.14;

        for (double i: data) {
            System.out.println("3.14 * "+i+"^2 = " + Math.pow(i, 2) * pi);
        }
    }
}
