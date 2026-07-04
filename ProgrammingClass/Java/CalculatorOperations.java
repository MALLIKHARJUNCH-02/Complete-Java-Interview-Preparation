import java.util.Scanner;

public class CalculatorOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number One : ");
        int number1 = sc.nextInt();

        System.out.println("Enter The Number Two  ");
        int number2 = sc.nextInt();

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

        sc.close();
    }
}
