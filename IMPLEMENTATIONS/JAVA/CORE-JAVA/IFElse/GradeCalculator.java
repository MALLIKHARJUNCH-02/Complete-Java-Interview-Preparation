import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The total Marks : ");
        int totalMarks = sc.nextInt();

        System.out.println("Enter the Number Of Subjects : ");
        int noSubjects = sc.nextInt();

        double avg = (double) (totalMarks / noSubjects);

        if (avg >= 90) {
            System.out.println("Grade O");
        } else if (avg >= 80) {
            System.out.println("Grade A");
        } else if (avg >= 70) {
            System.out.println("Grade B");
        } else if (avg >= 60) {
            System.out.println("Grade C");
        } else if (avg >= 50) {
            System.out.println("Grade D");
        } else if (avg >= 40) {
            System.out.println("Grade E");
        } else {
            System.out.println("FAIL");
        }

        sc.close();
    }
}