import java.util.Scanner;

public class StudentGradeUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Student Details : ");

        System.out.print("Enter The Subject 1 Marks : ");
        int subject1 = sc.nextInt();

        System.out.print("Enter The Subject 2 Marks : ");
        int subject2 = sc.nextInt();

        System.out.print("Enter The Subject 3 Marks : ");
        int subject3 = sc.nextInt();

        System.out.print("Enter The Subject 4 Marks : ");
        int subject4 = sc.nextInt();

        System.out.print("Enter The Subject 5 Marks : ");
        int subject5 = sc.nextInt();

        int sum = (subject1 + subject2 + subject3 + subject4 + subject5);

        int avg = sum / 5;

        System.out.println("Total Marks : " + sum);
        System.out.println("Average : " + avg);
        if (subject1 >= 35 && subject2 >= 35 && subject3 >= 35 && subject4 >= 35 && subject5 >= 35) {
            switch (avg / 10) {
                case 10:
                case 9:
                    System.out.println("Grade A");
                    break;

                case 8:
                    System.out.println("Grade B");
                    break;

                case 7:
                    System.out.println("Grade C");
                    break;

                case 6:
                    System.out.println("Grade D");
                    break;

                case 5:
                    System.out.println("Grade E");
                    break;

                default:
                    System.out.println("Fail");
                    break;
            }
        } else {
            System.out.println("Fail");
        }

        sc.close();

    }
}
