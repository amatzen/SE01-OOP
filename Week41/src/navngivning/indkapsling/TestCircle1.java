package navngivning.indkapsling;

public class TestCircle1 {
    public static void main(String[] args) {
        Circle1 c = new Circle1(1.24, 2.83, 12.7);

        System.out.println("x=" + c.x + "; y=" + c.y + "; d=" + c.d);

        c.d *= 1.37 * 2;
        c.x += 0.65;

        System.out.println("x=" + c.x + "; y=" + c.y + "; d=" + c.d);
    }
}
