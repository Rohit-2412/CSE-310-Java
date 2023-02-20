import java.util.Scanner;

public class JaggedArrayQues {
    public static void main(String[] args) {
        JaggedArrayQues obj = new JaggedArrayQues();
        Scanner sc = new Scanner(System.in);

        int numOfStudent = 0;
        System.out.print("Enter number of students: ");
        numOfStudent = sc.nextInt();
        double[][][] marks = new double[numOfStudent][][];

        for (int i = 0; i < numOfStudent; i++) {
            System.out.print("Enter number of subjects for student " + (i + 1) + ": ");
            int numOfSubjects = sc.nextInt();
            marks[i] = new double[numOfSubjects][];
            for (int j = 0; j < numOfSubjects; j++) {
                System.out.print("Enter number of CA for subject " + (j + 1) + ": ");
                int numOfMarks = sc.nextInt();
                marks[i][j] = new double[numOfMarks];
                for (int k = 0; k < numOfMarks; k++) {
                    System.out.print("Enter marks for subject " + (j + 1) + " and test " + (k + 1) + ": ");
                    marks[i][j][k] = sc.nextDouble();
                }
            }
        }

        char[][] avg = obj.findAvg(marks);

        int student = 1;
        int subject = 1;

        for (char[] a : avg) {
            for (char b : a) {
                System.out.println("Student " + student + " subject " + subject + " grade: " + b);
                subject++;
            }
            student++;
            subject = 1;
        }
        sc.close();

    }

    char findGrades(double marks) {
        if (marks >= 90)
            return 'A';
        else if (marks >= 80)
            return 'B';
        else if (marks >= 70)
            return 'C';
        else if (marks >= 60)
            return 'D';
        else if (marks >= 50)
            return 'E';
        else
            return 'F';
    }

    char[][] findAvg(double[][][] marks) {
        char[][] grades = new char[marks.length][];

        double sum = 0;
        double avg = 0;

        for (int i = 0; i < marks.length; i++) {
            grades[i] = new char[marks[i].length];
            for (int j = 0; j < marks[i].length; j++) {
                for (int k = 0; k < marks[i][j].length; k++) {
                    sum += marks[i][j][k];
                }
                avg = sum / marks[i][j].length;
                grades[i][j] = findGrades(avg);
                sum = 0;
                avg = 0;
            }
        }
        return grades;
    }
}
