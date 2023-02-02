class Patient {
    // data members
    int id;
    String patientName;
    int age;
    Long contactNumber;
    static int count = 0;

    // default constructor
    Patient() {
        patientName = "";
        age = 0;
        contactNumber = 0L;
    }

    // parameterized constrctor
    Patient(String name, int age, long con_num) {
        this.id = ++count;
        this.patientName = name;
        this.age = age;
        this.contactNumber = con_num;
    }

    // details
    public void display() {
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.patientName);
        System.out.println("Age: " + this.age);
        System.out.println("Patient Number: " + this.contactNumber);
        System.out.println();
    }
}

public class PatientHelper {

    public static void main(String[] args) {
        Patient p = new Patient("John", 18, 9876);
        Patient q = new Patient("Shyam", 19, 986);
        Patient r = new Patient("Hey", 24, 234);
        p.display();
        q.display();
        r.display();
    }
}
