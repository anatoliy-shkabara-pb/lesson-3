package array;

public class S02_ArraysFill {
    // Массивы (одномерный массив).

    public static void main(String[] args) {
        int[] array = new int[5];
        int x = array.length;

        // Заполнение массива.
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }

        // Вывод на экран значений элементов массива.
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // Специальная запись цикла for для прохождения элементов массива (Java 8)
        // Аналогична конструкции foreach, используемой в других языках программирования (например C#, PHP)
        // for (int ключ, массив)
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
    }
}
