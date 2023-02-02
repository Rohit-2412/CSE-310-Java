public class ForLoop {
    public static void main(String[] args) {
        // int i;
        // for (i = 0; i < 5; i++)
        // ;
        // System.out.println(i++);

        // multiple variable in for loop
        // int a, b;
        // b = 5;
        // for (a = 0; a < b; a++) {
        // System.out.println("a: " + a);
        // System.out.println("b: " + b);
        // b--;
        // System.out.println();
        // }

        // int x, y;
        // for (x = 0, y = 5; x <= y; x++, y--) {
        // System.out.println("x: " + x);
        // System.out.println("y: " + y);
        // System.out.println();
        // }

        for (int i = 1, j = 5; i > 0 && j > 2; i++, j--) {
            System.out.println("i = " + i + " j = " + j);
            System.out.println();
        }
    }
}
