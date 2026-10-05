import java.util.Scanner;

public class StudentMarksManagementSystem  {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Initial array size
        int[] marks = new int[2];

        int count = 0;

        System.out.println("Enter student marks (-1 to stop):");

        while (true) {

            int mark = sc.nextInt();

            // Stop entering marks
            if (mark == -1) {
                break;
            }

            // Check if array is full
            if (count == marks.length) {

                // Create a new array with double size
                int[] newMarks = new int[marks.length * 2];

                // Copy old marks to new array
                for (int i = 0; i < marks.length; i++) {
                    newMarks[i] = marks[i];
                }

                // Replace old array
                marks = newMarks;

                System.out.println("Array size increased to "
                        + marks.length);
            }

            // Add new mark
            marks[count] = mark;
            count++;
        }

        // Display all marks
        System.out.println("\nStudent Marks:");

        for (int i = 0; i < count; i++) {
            System.out.println("Student " + (i + 1)
                    + ": " + marks[i]);
        }

        sc.close();
    }
}