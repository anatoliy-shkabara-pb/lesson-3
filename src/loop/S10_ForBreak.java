package loop;

public class S10_ForBreak {
    // Циклическая конструкция (цикл со счетчиком) - for (с досрочным выходом из цикла - break).

    public static void main(String[] args) {
        for (int counter = 0; counter < 3; counter++) {
            System.out.println("Counter = " + counter);

            if (true) break;

            System.out.println("Эта строка не выполнится.");
        }
    }
}
