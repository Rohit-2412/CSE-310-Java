import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int sum = 0;
        int num[][] = new int[3][5];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (i + 1) * (j + 1);
            }
        }

        System.out.println("Matrix is: ");
        for (int a[] : num) {
            System.out.println(Arrays.toString(a));
        }
        // for each loop to display the sum of the values

        for (int[] a : num) {
            for (int i : a)
                sum += i;
        }

        System.out.println("sum is " + sum);
    }
}
