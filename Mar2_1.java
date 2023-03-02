public class Mar2_1 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "ABC", 12.5, 100.5);
        Student s2 = new Student();
        s1.showDetails();
        System.out.println();
        s2.showDetails();
        System.out.println();

        CseStudent cs1 = new CseStudent(2, "XYZ", 50, 100, "Android");
        CseStudent cs2 = new CseStudent();
        cs1.showDetails();
        System.out.println();
        cs2.showDetails();
    }
}

class Student {
    int rollNo;
    String name;
    double weight;
    double height;
    double bmi;

    Student() {
        rollNo = 0;
        name = "no name";
        weight = 0;
        height = 0;
        bmi = 0;
    }

    Student(int rollNo, String name, double weight, double height) {
        this.rollNo = rollNo;
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.bmi = weight / (height * height);
    }

    void showDetails() {
        // print all details of student
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("BMI: " + bmi);
    }

}

class CseStudent extends Student {
    String major;

    CseStudent() {
        super();
        major = "no branch";
    }

    CseStudent(int rollNo, String name, double weight, double height, String branch) {
        super(rollNo, name, weight, height);
        this.major = branch;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("Branch: " + major);
    }
}