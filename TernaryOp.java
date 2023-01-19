public class TernaryOp {
    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println("value of b is: " + b);
        b = (a == 10) ? 20 : 30;
        System.out.println("Value of b is: " + b);

        if (true) {
            System.out.println("IF CASE EXECUTED");
        } else {
            System.out.println("ELSE CASE EXECUTED");
        }

        if (!true) {
            System.out.println("IF CASE EXECUTED");
        } else {
            System.out.println("ELSE CASE EXECUTED");
        }

    }
}
