public class Feb2 {
    public static void main(String[] args) {
        Feb2_1 obj = new Feb2_1();
        obj.meth1();
        obj.meth2(10, 20);
        int c = obj.meth3(10, 20, 30);
        System.out.println("Sum of these three numbers is: " + c);
        System.out.println("Sum of these three numbers is: " + obj.meth3(11, 13, 15));
    }
}

class Feb2_1 {
    int m1 = 10;
    double m2 = 10.05;

    public void meth1() {
        System.out.println("Method 1 is executing ....");
        System.out.println("The value of m1 is: " + m1);
        System.out.println("The value of m2 is: " + m2);
    }

    public void meth2(int a, int b) {
        System.out.println("Method 2 is executing ....");
        int sum = a + b;
        System.out.println("Sum of these two numbers is: " + sum);
    }

    public int meth3(int a, int b, int c) {
        System.out.println("Method 3 is executing ....");
        return a + b + c;
    }

}
