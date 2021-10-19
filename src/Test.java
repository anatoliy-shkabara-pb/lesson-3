import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input x: ");
        int x = scanner.nextInt();
        System.out.println("input y: ");
        int y = scanner.nextInt();

        if (x > 0 & y > 0) {
            System.out.println("numbers are positives");
        }

        // System.out.println(+(x+y));

        // System.out.println("abc " + x+y);
    }
}
