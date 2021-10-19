package array;

public class S01_Arrays {
    // Массивы (одномерный массив).

    public static void main(String[] args) {
        // На 9 строке создаем массив целочисленных элементов с именем array размерностью в 5 элементов

        int[] array = new int[5];

        // На 13 строке элементу массива array по индексу 0 присваиваем значение 10

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        // На 21 строке выводим на экран значение элемента массива array по индексу 0

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }
}
