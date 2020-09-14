package booleans;

import java.util.Scanner;

public class Terninger {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Indtast terningeslag mellem 1 - 6: ");
        String input = scn.nextLine();

        int data = 0;
        try {
            data = Integer.parseInt(input);

            if(data > 6 || data < 0) throw new IllegalArgumentException("Terningeslaget skal være mellem 1 og 6");
        } catch (IllegalArgumentException e) {
            System.out.println("Fejl");
            System.out.println(e.getMessage());
            System.exit(0);
        }

        boolean greatherThanThree = (data >= 3) ? true : false;

        /*

        Short hand for:

            if ( data >= 3 ) {
                return true;
            } else {
                return false
            }

        */


        System.out.println(greatherThanThree);


    }
}
