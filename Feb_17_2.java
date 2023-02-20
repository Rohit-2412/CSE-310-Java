import java.util.Scanner;

public class Feb_17_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first value ");
        int a = s.nextInt();
        System.out.print("Enter second value ");
        int b = s.nextInt();

        int key = (int) Math.random() * 50 + 1;
        if (checkLucky(a, b, key)) {
            System.out.println("Lucky!");
        } else
            System.out.println("Not less than answer");
        s.close();
    }

    static boolean checkLucky(int a, int b, int answer) {
        if ((a + b) <= answer)
            return true;
        else
            return false;
    }
}
