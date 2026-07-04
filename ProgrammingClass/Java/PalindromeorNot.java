import java.util.Scanner;

public class PalindromeorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int number = sc.nextInt();

        int original = number;

        int reverse = 0;

        while (number != 0) {
            int temp = number % 10;
            reverse = reverse * 10 + temp;
            number /= 10;
        }

        if (reverse == original) {
            System.out.println(original + " Is a Palindrome");
        } else {
            System.out.println(original + " Is Not a Palindrome");
        }

        sc.close();
    }
}
