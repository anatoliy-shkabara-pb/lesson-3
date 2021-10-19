import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt(101);
        System.out.println("rand x: " + x);

        double y = Math.random();
        System.out.println("rand y: " + y);
    }
}
