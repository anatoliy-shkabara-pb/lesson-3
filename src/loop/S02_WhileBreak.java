package loop;

public class S02_WhileBreak {
    // Циклическая конструкция - while. (с досрочным выходом из цикла - break)

    public static void main(String[] args) {
        int counter = 0;

        while (counter < 3) {
            counter++;
            System.out.println("Counter " + counter);

            if (true) break;

            System.out.println("Эта строка не выполнится.");
        }

        System.out.println("Произведено " + counter + " итераций.");
    }
}
