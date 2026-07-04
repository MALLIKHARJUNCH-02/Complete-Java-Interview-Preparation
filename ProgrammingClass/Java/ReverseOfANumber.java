import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number : ");
        int number = sc.nextInt();

        // 153
        int original = number;
        int rev = 0;
        while (number != 0) {
            int temp = number % 10;
            rev = rev * 10 + temp;
            number /= 10;
        }

        System.out.println("Original Number : " + original);
        System.out.println("Reversed Number : " + rev);

        sc.close();
    }
}
