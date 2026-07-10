import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number : ");
        int number = sc.nextInt();

        int original = number;

        while (number != 1 && number != 4) {

            int sum = 0;

            while (number != 0) {

                int digit = number % 10;

                sum += digit * digit;

                number /= 10;
            }

            number = sum;
        }

        if (number == 1) {
            System.out.println(original + " Is A Happy Number");
        } else {
            System.out.println(original + " Is A Not A Happy Number");
        }

        sc.close();
    }
}