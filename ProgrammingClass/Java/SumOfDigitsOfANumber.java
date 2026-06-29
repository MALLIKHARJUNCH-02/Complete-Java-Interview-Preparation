import java.util.Scanner;

public class SumOfDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number : ");
        int number = sc.nextInt();

        int original = number;

        int sum = 0;

        while (number != 0) {
            int temp = number % 10;

            sum += temp;

            number /= 10;
        }

        System.out.println("Sum Of The Digits in the Number " + original + " is " + sum);
        sc.close();
    }
}
