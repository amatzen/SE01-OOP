package standardbibliotek.tidstagning;

public class Timing {
    final static double y_const = 1.0000001;

    static double fun(double x, double y) {
        if (y == 1) {
            return x;
        } else {
            return fun(x,y-1) * fun(x,y-1);
        }
    }

    public static void main(String[] args) {
        double startTime;
        double endTime;

        for (int x = 1; x<=32; x++) {
            startTime = System.currentTimeMillis();
            System.out.println(fun(x,y_const));
            endTime = System.currentTimeMillis();

            System.out.println(endTime - startTime);
            System.out.println("------------");
        }

    }

}
