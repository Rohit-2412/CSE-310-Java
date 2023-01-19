public class LogicalOp {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a is " + a);
        System.out.println("a is " + b);
        System.out.println("a && b : " + (a && b));
        System.out.println("a || b : " + (a || b));
        System.out.println("!(a && b) : " + !(a && b));
    }
}
