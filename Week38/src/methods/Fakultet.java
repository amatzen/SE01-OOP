package methods;

public class Fakultet {
    public static void main(String[] args) {
        System.out.println(fac(10));
    }

    public static int fac(int a) {
        if(a == 0) return 1;
        else {
            int n = a*fac(a-1);
            return n;
        }
    }
}
