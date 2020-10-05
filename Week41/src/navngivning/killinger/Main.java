package navngivning.killinger;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i<Math.random()*100; i++) {
            new Kitten(Math.random()*100+Math.random());
        }

        System.out.println(Kitten.count);
    }
}
