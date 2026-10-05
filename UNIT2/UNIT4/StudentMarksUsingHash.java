import java.util.HashMap;
import java.util.Scanner;

public class StudentMarksUsingHash {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create HashMap
        HashMap<Integer, Integer> students = new HashMap<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Store roll number and marks
        for (int i = 0; i < n; i++) {
            System.out.print("Enter roll number: ");
            int rollNo = sc.nextInt();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            students.put(rollNo, marks);
        }

        // Search for a student
        System.out.print("\nEnter roll number to find marks: ");
        int searchRollNo = sc.nextInt();

        if (students.containsKey(searchRollNo)) {
            System.out.println("Marks: " + students.get(searchRollNo));
        } else {
            System.out.println("Student not found.");
        }

        sc.close();
    }
}
