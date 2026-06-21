import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number : ");
        int num = sc.nextInt();

        int original = num;
        int rev = 0;
        while (original != 0) {
            int temp = original % 10;
            rev = rev * 10 + temp;
            original /= 10;
        }

        if (num == rev) {
            System.out.println("Number is a palindrome");
        } else {
            System.out.println("Number Is not a palindrome");
        }

        sc.close();
    }
}
