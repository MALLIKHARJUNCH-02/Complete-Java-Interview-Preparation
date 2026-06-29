import java.util.Scanner;

class StudentGrade {

    Scanner sc = new Scanner(System.in);

    int subject1;
    int subject2;
    int subject3;
    int subject4;
    int subject5;

    public void printStudentGrade() {

        System.out.println("--------- Student Grade ---------");

        System.out.println("Enter the Student Details : ");

        System.out.print("Enter The Subject 1 Marks : ");
        subject1 = sc.nextInt();

        System.out.print("Enter The Subject 2 Marks : ");
        subject2 = sc.nextInt();

        System.out.print("Enter The Subject 3 Marks : ");
        subject3 = sc.nextInt();

        System.out.print("Enter The Subject 4 Marks : ");
        subject4 = sc.nextInt();

        System.out.print("Enter The Subject 5 Marks : ");
        subject5 = sc.nextInt();

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
    }

}

class Calculator extends StudentGrade {

    int number1;
    int number2;

    public void performCalculations() {

        System.out.println("--------- Calculator ---------");

        System.out.println("Enter The Number One : ");
        number1 = sc.nextInt();

        System.out.println("Enter The Number Two : ");
        number2 = sc.nextInt();

        System.out.println("Enter the Operation Symbol");
        System.out.println("Addition ( + )");
        System.out.println("Difference ( - )");
        System.out.println("Multiplication ( * )");
        System.out.println("Division ( / )");

        char ch = sc.next().charAt(0);

        switch (ch) {
            case '+':
                System.out.println(
                        "Addition Of Two Numbers " + number1 + " and " + number2 + " is "
                                + (number1 + number2));
                break;
            case '-':
                System.out.println(
                        "Difference Of Two Numbers " + number1 + " and " + number2 + " is "
                                + (number1 - number2));
                break;
            case '*':
                System.out.println(
                        "Multiplication Of Two Numbers " + number1 + " and " + number2 + " is "
                                + (number1 * number2));
                break;
            case '/':
                if (number2 != 0) {
                    System.out.println(
                            "Division Of Two Numbers " + number1 + " and " + number2 + " is "
                                    + (((double) number1 / (double) number2)));
                } else {
                    System.out.println("Divide By 0 Not Possible");
                }
                break;

            default:
                System.out.println("Sorry! No related Operation Found");
                break;
        }
    }

}

class PrimeNumber extends Calculator {
    int lowerRange;
    int higherRange;

    public void printPrime() {

        System.out.println("--------- Prime Numbers In Range ---------");
        System.out.println("Enter the Lower Range ");
        lowerRange = sc.nextInt();

        System.out.println("Enter the Higher Range ");
        higherRange = sc.nextInt();

        for (int i = lowerRange; i <= higherRange; i++) {
            boolean isPrime = true;
            if (i <= 1) {
                continue;
            }

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + "\t");
            }
        }
    }

}

public class SingleInheritance {
    public static void main(String[] args) {
        PrimeNumber pn = new PrimeNumber();

        pn.printStudentGrade();
        pn.performCalculations();
        pn.printPrime();

        pn.sc.close();
    }
}
