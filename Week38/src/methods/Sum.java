package methods;

public class Sum {
    public static void main(String[] args) {
        System.out.println(
            sum(new int[]{2, 4})
        );
    }

    public static int sum(int[] input) {
        Integer output = 0;

        for (int i = 0; i < input.length; i++) {
            output += input[i];
        }

        return output;
    }
}
