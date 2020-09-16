package arrays;

public class Sudoku {
    public static void main(String[] args) {

        System.out.println();

        int[][] soduku = {
                {8,3,9, 2,1,7, 6,5,4},
                {7,4,6, 9,8,5, 2,1,3},
                {1,2,5, 3,4,6, 7,9,8},

                {6,5,3, 1,2,8, 9,4,7},
                {2,1,8, 7,9,4, 5,3,6},
                {9,7,4, 5,6,3, 8,2,1},

                {4,9,7, 8,5,1, 3,6,2},
                {5,8,1, 6,3,2, 4,7,9},
                {3,6,2, 4,7,9, 1,8,5}
        };

        // Hver række
        int i_y = 0;
        for (int[] y: soduku) {

            // Hver kolonne
            int i_x = 0;
            for (int x: y) {
                System.out.printf("%2d ", x);

                // Hvis kolonnen er heltalsdivisibel med 3, så lav en divider
                if(i_x > 0 && i_x < 7 && (i_x+1) % 3 == 0) {
                    System.out.printf(" | ");
                }

                i_x++;
            }

            // Hvis rækken er heltalsdivisibel med 3, så lav et divider
            if(i_y > 0 && i_y < 7 && (i_y+1) % 3 == 0) {
                System.out.println("\n ---------+-----------+---------");
            } else {
                System.out.printf("\n");
            }

            i_y++;
        }

    }
}
