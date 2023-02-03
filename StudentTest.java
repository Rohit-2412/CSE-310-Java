public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Stu1", "CSE");
        Student s2 = new Student("Stu2", "ECE");
        Student s3 = new Student("Stu3", "PHY");

        s1.display();
        s2.display();
        s3.display();
    }
}

/*
 * attributes: rollNumber(int), name(string), branchName(string)
 * add parameterized constructor accepting the name and branchName as parameter
 * auto generate roll number using the concept of static variable
 * method to display the attributes
 */
class Student {
    // data members
    static int rollCount = 1;
    int rollNumber;
    String name;
    String branchName;

    // default constructor
    Student() {
        this.name = "";
        this.branchName = "";
    }

    // parameterized constructor
    Student(String name, String branchName) {
        this.name = name;
        this.branchName = branchName;
        this.rollNumber = rollCount++;
    }

    // method to display the attributes
    public void display() {
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Name: " + this.name);
        System.out.println("Branch Name: " + this.branchName);
        System.out.println();
    }
}
