public class Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b));
        System.out.println("a + b = " + a + b);
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c / a));
        System.out.println("a++ = " + (a++));
        System.out.println("a-- = " + (a--));

        char c1 = 'A';
        char c2 = 'A';
        System.out.println("c1 + c2 = " + (c1 + c2));
        System.out.println("c1++ = " + (c1++));
        System.out.println("++c1 = " + (++c1));
        System.out.println("(int)c1 = " + (int) c1);
        // difference between d1 and d2

        System.out.println("d++ = " + (d++));
        System.out.println("++d = " + (++d));
    }
}
