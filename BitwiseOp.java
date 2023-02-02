public class BitwiseOp {
    public static void main(String[] args) {
        // int a = 12;

        // // doubles the value
        // System.out.println("value of a << 1: " + (a << 1));
        // // halves the value
        // System.out.println("value of a >> 1: " + (a >> 1));

        // int b = -10;
        // System.out.println("value of b >> 2: " + (b >> 2));
        // b = -60;
        // System.out.println("value of b >> 2: " + (b >> 2));
        // System.out.println("value of b << 2: " + (b << 2));
        // b = -10;
        // System.out.println("value of b << 2: " + (b << 2));
        // b = 100;
        // System.out.println("value of ~b: " + (~b));

        // b = 10;
        // System.out.println("Value of a >>> 2: " + (a >>> 2));

        int a = 60;
        int b = 13;
        int c = 0;

        c = a & b;
        System.out.println("a & b : " + c);

        c = a | b;
        System.out.println("a | b : " + c);

        c = a ^ b;
        System.out.println("a ^ b : " + c);

        c = ~a;
        System.out.println("~a : " + c);

        c = a << 2;
        System.out.println("a << 2 : " + c);

        c = a >> 2;
        System.out.println("a >> 2 : " + c);

        c = a >>> 2;
        System.out.println("a >>> 2 : " + c);

        int d = -60;
        c = d >>> 2;
        System.out.println("d >>> 2 : " + c);

        c = d >> 2;
        System.out.println("d >> 2 : " + c);

        int e = -1;
        c = e >> 32;
        System.out.println("e >> 32 : " + c);

        c = e >> 34;
        System.out.println("e >> 34 : " + c);

        b = 30;
        System.out.println("~b : " + (~b));

        b = -53;
        System.out.println("~b : " + (~b));

        int x = 10;
        int y = 5;

        while (x-- > 7 || ++y < 8)
            ;
        System.out.println(x);
        System.out.println(y);
    }
}
