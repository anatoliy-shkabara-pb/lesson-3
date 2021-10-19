package loop;

public class S09_For {
    // Циклическая конструкция - for (цикл со счетчиком).

    public static void main(String[] args) {
        // for ( Инициализация счетчика итераций; Условие; Изменение счетчика ) { Тело цикла }

        for (int counter = 0; counter < 3; counter++) {
            System.out.println("Counter = " + counter);
        }

        //counter = 0; //  counter - недоступен за пределами цикла for.
    }
}
