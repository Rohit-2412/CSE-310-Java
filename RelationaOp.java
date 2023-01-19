public class RelationaOp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a is : " + a);
        System.out.println("b is : " + b);
        System.out.println("a == b : " + (a == b));
        // error: incomparable types: int and boolean
        // System.out.println("a == true : " + (a == true));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
    }
}
