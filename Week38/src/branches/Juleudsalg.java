package branches;

public class Juleudsalg {
    public static void main(String[] args) {

        long secondsSinceNewYear;

        // december
        secondsSinceNewYear = 31104400;

        // august
        //secondsSinceNewYear = 20736000;

        float price = 599.95f;

        int month = (int) (secondsSinceNewYear / 60 / 60 / 24 / 30);

        if ( month == 12 ) {
            price *= .7f;
        }

        System.out.printf("%.2f", price);

    }
}
