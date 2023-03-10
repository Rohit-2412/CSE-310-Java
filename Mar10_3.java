public class Mar10_3 {
    public static void main(String[] args) {
        // Parent p1 = new Parent();
        // Parent p2 = new Parent(1);
        // Parent p3 = new Parent();
        System.out.println();
        System.out.println();
        Child c1 = new Child();
        // Child c2 = new Child();
    }
}

class Parent {
    Parent() {
        System.out.println("Parent 0 arg constructor");
    }

    Parent(int x) {
        System.out.println("Parent 1 arg constructor");
    }

    // static block will be executed before the constructor and only once for each
    // class
    static {
        System.out.println("Parent static block");
    }

    static {
        System.out.println("Parent static block 2");
    }
    // init block
    // they'll be called in order they are created
    // they'll be called for each object created
    {
        System.out.println("Parent init block1");
    }

    {
        System.out.println("Parent init block2");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child 0 arg constructor");
    }

    static {
        System.out.println("Child static block");
    }

    // init block
    {
        System.out.println("Child init block 1");
    }
    {
        System.out.println("Child init block 2");
    }
}