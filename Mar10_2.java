public class Mar10_2 {
    // Object class is the parent class of all the classes in Java
    public static void main(String[] args) {
        Student s1 = new Student(10, "Name");
        System.out.println(s1);
        Student s2 = new Student(10, "Name");
        Student s3;
        // hash code- a unique number for each object
        s3 = s1;
        System.out.println(s1.hashCode()); // 1829164700
        System.out.println(s2.hashCode()); // 2018699554
        System.out.println(s3.hashCode()); // 1829164700
        // implies that s1 and s3 are pointing to the same object

        System.out.println(s1 == s2); // false (s1 and s2 are pointing to different objects)
        System.out.println(s1 == s3); // true (s1 and s3 are pointing to the same object)

        System.out.println("Is s1 equals to s3: " + s1.equals(s3)); // true
        System.out.println("Is s1 equals to s2: " + s1.equals(s2)); // false

        System.out.println("is s1 name equals to s2 name: " + s1.name.equals(s2.name)); // true, only name is compared
        System.out.println("is s1 name equals to s3 name: " + s1.name.equals(s3.name)); // true, only name is compared
    }
}

class Student {
    int rollNo;
    String name;

    Student() {
    }

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public String toString() {
        return "Roll No: " + rollNo + " Name: " + name;
    }
}