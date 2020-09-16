package arrays;

public class LaengdenAfEnMaaned {
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

        String[] month = {
                "januar",
                "februar",
                "marts",
                "april",
                "juni",
                "juli",
                "august",
                "september",
                "oktober",
                "november",
                "december"
        };

        for (int i = 0 ; i < month.length; i++) {

            System.out.println(month[i] + " varer " + monthLength[i] + " dage");

        }

    }
}
