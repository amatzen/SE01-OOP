package standardbibliotek.date;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date date = new Date();

        for (int i = 3; i<=6; i++) {
            date.setTime((long) Math.pow(10, i));
            System.out.println(date.toString());
        }



    }
}
