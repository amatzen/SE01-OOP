package navngivning.indkapsling;

public class TestCircle2 {
    public static void main(String[] args) {
        Circle2 c = new Circle2(1.24, 2.83, 12.7);

        double c_x = c.getX();
        double c_y = c.getY();
        double c_r = c.getR();

        System.out.println("x=" + c_x + "; y=" + c_y + "; r=" + c_r);

        c.setR(c_r *= 1.37);
        c.setX(c_x += 0.65);

        System.out.println("x=" + c_x + "; y=" + c_y + "; r=" + c_r);
    }
}
