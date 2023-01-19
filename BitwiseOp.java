public class BitwiseOp {
    public static void main(String[] args) {
        int a = 12;

        // doubles the value
        System.out.println("value of a << 1: " + (a << 1));
        // halves the value
        System.out.println("value of a >> 1: " + (a >> 1));

        int b = -10;
        System.out.println("value of b >> 2: " + (b >> 2));
        b = -60;
        System.out.println("value of b >> 2: " + (b >> 2));
        System.out.println("value of b << 2: " + (b << 2));
        b = -10;
        System.out.println("value of b << 2: " + (b << 2));
        b = 100;
        System.out.println("value of ~b: " + (~b));

        b = 10;
        System.out.println("Value of a >>> 2: " + (a >>> 2));
    }
}
