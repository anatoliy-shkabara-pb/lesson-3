package array;

public class S12_JaggedArray {
    // Зубчатые массивы (Jagged Array).

    public static void main(String[] args) {
        int[][] jagged = new int[][]
                {
                        new int[]{1, 2},
                        new int[]{1, 2, 3, 4, 5},
                        new int[]{1, 2, 3}
                };

        // Во внешнем цикле выполняется проход по всем вложенным массивам.
        for (int i = 0; i < jagged.length; ++i) {
            // Во внутреннем цикле выполняется обращение к каждому элементу вложенного массива.
            for (int j = 0; j < jagged[i].length; ++j) {
                System.out.print(" " + jagged[i][j]);
            }
            System.out.print("\n");
        }
    }
}
