package loop;

import java.util.Scanner;

public class S04_GuessColor {
    // Циклическая конструкция - while.

    public static void main(String[] args) {
        System.out.println("Угадайте задуманный цвет с пяти попыток.");
        System.out.println("Для выхода из программы введите - exit.");

        final int MAX_ATTEMPT = 5; // Допустимое количество попыток.
        int attempt = 0;           // Счетчик попыток.
        String color = "red";      // Задуманный цвет.
        Scanner in = new Scanner(System.in);

        while (attempt < MAX_ATTEMPT) {
            attempt++;
            System.out.println("Попытка " + attempt + ":");
            String value = in.next();

            if (value.equals("exit")) {
                break;
            }

            if (!value.equals(color)) {
                continue;
            }

            System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
            break;
        }

        System.out.println("Конец игры!");
    }
}
