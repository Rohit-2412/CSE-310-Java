public class Mar2_3 {

    public static void main(String[] args) {
        C c1 = new C();
        System.out.println();
        System.out.println();
        C c2 = new C(1, 2, 3);
    }
}

class A {
    int i;

    A() {
        System.out.println("inside default constructor of A()");
    }

    A(int i) {
        this.i = i;
        System.out.println("inside parameterized constructor of A()");
    }
}

class B extends A {
    int j;

    B() {
        System.out.println("inside default constructor of B()");
    }

    B(int i, int j) {
        // super(i);
        this.j = j;
        System.out.println("inside parameterized constructor of B()");
    }
}

class C extends B {
    int k;

    C() {
        System.out.println("inside default constructor of C()");
    }

    C(int i, int j, int k) {
        super(i, j);
        this.k = k;
        System.out.println("inside parameterized constructor of C()");
    }
}