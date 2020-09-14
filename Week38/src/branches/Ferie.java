package branches;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ferie {
    public static void main(String[] args) {

        Map<Integer, String> map = Stream.of(new String[][] {
            { "4", "Påskeferie" },
            { "7", "Sommerferie" },
            { "8", "Sommerferie" },
            { "10", "Oktober" },
            { "12", "Juleferie" }
        }).collect(Collectors.toMap(
                data -> (Integer) Integer.parseInt(data[0]),
                data -> (String) data[1])
        );

        Scanner scn = new Scanner(System.in);

        int input = 0;
        try {
            System.out.println("Indtast måned mellem 1 og 12");
            input = Integer.parseInt(scn.nextLine());

            if(input < 1 || input > 12) throw new IllegalArgumentException("Indtast måned mellem 1 og 12");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

        if ( map.containsKey(input) ) {
            System.out.println(map.get(input));
        } else {
            System.out.println("Hårdt arbejde");
        }

    }
}
