package array;

public class S13_MethodWithArray {
    static int[] modifyArray(int[] array, int modifier) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * modifier;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};

        myArray = modifyArray(myArray, 5);

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + ", ");
        }
    }
}
