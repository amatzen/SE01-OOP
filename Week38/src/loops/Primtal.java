package loops;

public class Primtal {
    public static void main(String[] args) {
        int highest = 0;

        for (int i = 0; i <= 1000000; i++) {
            if ( isPrime(i) ) {
                highest = i;
            }
        }

        System.out.println(highest);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
