import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] a1 = new int[] {1,2,3};
        int[] a2 = new int[] {1,2,3};

        System.out.println("a2[0]: " + a2[0]);


        boolean isEq = Arrays.equals(a1, a2);
        //boolean isEq = a1[1] == a2[1];

        System.out.println(isEq);
    }
}
