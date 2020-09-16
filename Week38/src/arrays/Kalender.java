package arrays;

public class Kalender {
    public static void main(String[] args) {
        int[] monthLength = {
                31, // tilsvarende til monthLength[0]
                28, // monthLength[1]
                31,
                30,
                31,
                30,
                31,
                30,
                31,
                30,
                31
        };

        int[] monthLengthLeap = {
                31,
                29,
                31,
                30,
                31,
                30,
                31,
                30,
                31,
                30,
                31
        };

        for (int i = 2000; i <= 2020; i++) {
            int[] ml = ( i % 4 == 0 ) ? monthLengthLeap : monthLength;

            System.out.printf(i + " : ");
            for (int l : ml) {
                System.out.printf("%2d ", l);
            }
            System.out.printf("\n");
        }
    }
}
