package dk.alexander.ovelser.week37;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 1.1
        System.out.println("Hello, World!");

        // 1.2
        /*
        ** Double for præcisering
        ** Float for alm. brug
        ** Integer, hvis i hele grader
        **/

        // 1.3
        /*
        ** Byte - da byte er hukommelsesvenligt (1-12)
        **/

        // 2.1
        /*
        ** Et udtryk kan være mange ting, det kan være et matematisk stykke kode,
        ** der kan give en færdig værdi eller en deklaration af eksempelvis en variable.
        **/

        // 2.2
        /*
        ** Ja, en tildeling af en værdi til et variabel er et udtryk / expression.
        **/

        // 2.3
        /*
        ** En expression udgør i sig selv ikke noget kode, det er et udtryk, som fungerer i en
        ** kontekst af et statement.
        **
        ** F.eks.
        ** if ( 1 + 5 == 6 ) { return true; }
        ** if er et statement
        ** alt inde i parentesen (1 + 5 == 6 ) er et udtryk / expression.
        **/

        // 3.1
        System.out.println("\n3.1");

        double[] data = {1, 3, 5};
        double pi = 3.14;

        for (double i: data) {
            System.out.println("3.14 * "+i+"^2 = " + Math.pow(i, 2) * pi);
        }

        // 3.2
        System.out.println("\n3.2");
        double sum_data = 0.00;
        for (double i: data) {
            System.out.println("2 * 3.14 * " + i + " = " + 2*pi*i);
            sum_data += 2*pi*i;
        }

        System.out.println("Sum: " + sum_data);

        //  3.3
        System.out.println("\n3.3");

        Scanner scn = new Scanner(System.in);

        System.out.println("Indtast temperatur i Celsius: ");
        String celsiusInput = scn.nextLine();

        double celsius = 0;

        try {
            celsius = Double.parseDouble(celsiusInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Ikke en temperatur");
            System.out.println("\n"+e.getMessage());
            System.exit(0);
        }

        double fahrenheit = celsius * 1.8 + 32.00;

        System.out.println(celsiusInput + "°C = " + fahrenheit + "°F");

        // 3.4
        System.out.println("\n3.4");

        long epochTime = System.currentTimeMillis();
        Date d = new Date(epochTime);

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);

        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));

        // 3.5
        System.out.println("\n3.5");

        System.out.println("Indtast en måned (0-11)");
        String monthSelector = scn.nextLine();
        int month = 0;

        try {
            month = Integer.parseInt(monthSelector);

            if (month < 0 || month > 11) {
                throw new IllegalArgumentException("Month is between 0 and 11");
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Ikke en måned");
            System.out.println("\n"+e.getMessage());
            System.exit(0);
        }

        System.out.println("Måned: " + month);
        month += 0.5;

        System.out.println("Måned: " + month);
        month += 0.5;

        System.out.println("Måned: " + month);

        /*
        ** Konverting af double værdi til integer er default på floor-funktionen, dvs.
        ** int a = floor(double b);
        **/

        // 3.7
        System.out.println("\n3.7");

        double[] monthTemps = {
            21.5,
            23.7,
            19.6,
            22.5,
            25.3,
            21.7,
            18.9
        };

        double prevMonthTemp = 0;
        for (double monthTemp: monthTemps ) {
            if(prevMonthTemp == 0) {
                System.out.println(monthTemp);
            } else {
                System.out.println(Math.abs(monthTemp - prevMonthTemp));
            }

            prevMonthTemp = monthTemp;
        }

    }

}