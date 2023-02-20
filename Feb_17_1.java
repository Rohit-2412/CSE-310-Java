import java.util.Arrays;
import java.util.Scanner;

public class Feb_17_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your lucky number between 1 to 20: ");
        int key = s.nextInt();
        if (key < 0 || key > 20) {
            System.exit(0);
        }
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 20 + 1);
        }
        System.out.println(Arrays.toString(arr));
        drawChecker(arr, key);
        s.close();
    }

    static void drawChecker(int[] a, int key) {
        int x = 0;
        for (int i = 0; i < 20; i++) {
            if (a[i] == key) {
                x = 1;
                break;
            }
        }
        if (x != 0) {
            System.out.println("YOU ARE LUCKY!!!");
        } else {
            System.out.println("YOU ARE NOT LUCKY!!!");
        }
    }
}
