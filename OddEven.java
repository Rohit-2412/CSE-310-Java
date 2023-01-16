import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        if (isPrime(number)) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }

        if (isPerfectSquare(number)) {
            System.out.println("Perfect square");
        } else {
            System.out.println("Not a perfect square");
        }

        if (isPerfectCube(number)) {
            System.out.println("Perfect cube");
        } else {
            System.out.println("Not a perfect cube");
        }

        sc.close();
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

    static boolean isPerfectSquare(int n) {
        for (int i = 1; i < n; i++) {
            if (i * i == n)
                return true;
        }
        return false;
    }

    static boolean isPerfectCube(int n) {
        for (int i = 1; i < n; i++) {
            if (i * i * i == n)
                return true;
        }
        return false;
    }
}
