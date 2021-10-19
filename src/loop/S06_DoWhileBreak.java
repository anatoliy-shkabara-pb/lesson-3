package loop;

public class S06_DoWhileBreak {
    // Циклическая конструкция - do-while. (с досрочным выходом из цикла - break)

    public static void main(String[] args) {
        int counter = 0;

        do {
            counter++;
            System.out.println("Counter " + counter);

            if (true) break;
            System.out.println("Эта строка не выполнится.");
        }
        while (counter < 3) ;

        System.out.println("Произведено " + counter + " итераций.");
    }
}
