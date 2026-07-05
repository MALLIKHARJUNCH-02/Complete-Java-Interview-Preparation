import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        int original = num;

        while (num != 1 && num != 4) {

            int sum = 0;

            while (num > 0) {

                int digit = num % 10;
                sum += digit * digit;
                num /= 10;
            }

            num = sum;
        }

        if (num == 1)
            System.out.println(original + " is a Happy Number");
        else
            System.out.println(original + " is Not a Happy Number");
        sc.close();
    }
}