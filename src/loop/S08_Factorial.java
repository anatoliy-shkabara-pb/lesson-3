package loop;

public class S08_Factorial {
    // Циклическая конструкция - do-while.

    // Факториал числа n (обозначается n!, произносится - эн факториал) — это произведение всех натуральных чисел,
    // от 1 до n включительно:
    //     n! = 1 * 2 * 3 * ... * n
    //     0! = 1

    // В комбинаторике факториал натурального числа n интерпретируется как количество перестановок множества из n элементов.
    // Например, для множества {A,B,C,D} из 4-х элементов существует: 4! = 1 * 2 * 3 * 4 = 24 перестановки:

    //     ABCD  BACD  CABD  DABC
    //     ABDC  BADC  CADB  DACB
    //     ACBD  BCAD  CBAD  DBAC
    //     ACDB  BCDA  CBDA  DBCA
    //     ADBC  BDAC  CDAB  DCAB
    //     ADCB  BDCA  CDBA  DCBA

    public static void main(String[] args) {
        int counter = 5;
        int factorial = 1;

        System.out.print("Факториал числа: " + counter + "! = ");

        do {
            // Сначала умножение, потом декремент.
            factorial *= counter--;

            // Данная строка эквивалентна:

            //factorial = factorial * counter;
            //counter = counter - 1;
        }
        while (counter > 0);

        System.out.print(factorial);
    }
}
