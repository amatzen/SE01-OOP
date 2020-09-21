package methods;

public class CirklerITal {
    public static double pi = 3.14;

    public static void main(String[] args) {

        int[] d = {1,3,5};

        for (int i : d) {
            System.out.println("r = " + i);
            System.out.println("Areal: " + areal(i));
            System.out.println("Omkreds: " + omkreds(i));
            System.out.println("");
        }

    }

    public static double areal(double r) {
        return Math.pow(r, 2) * CirklerITal.pi;
    }

    public static double omkreds(double r) {
        return 2 * CirklerITal.pi * r;
    }
}
