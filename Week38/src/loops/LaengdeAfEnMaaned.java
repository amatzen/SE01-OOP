package loops;

import java.time.YearMonth;
import java.util.Scanner;

public class LaengdeAfEnMaaned {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Indtast måned (1-12)");
        String raw_input = scn.nextLine();

        int input = 0;
        try {
            input = Integer.parseInt(raw_input);

            if (input < 1 || input > 12) throw new Exception("Indtast måned mellem 1 og 12");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

        YearMonth ym = YearMonth.of(1999, input);

        System.out.println(ym.lengthOfMonth());
    }
}
