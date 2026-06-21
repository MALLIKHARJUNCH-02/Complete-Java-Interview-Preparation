import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int number = sc.nextInt();

        int original = number;
        int sum = 0;
        int count = 0;

        while (original != 0) {
            count++;
            original = original / 10;
        }

        original = number;
        while (original != 0) {
            int temp = original % 10;
            sum = sum + (int) (Math.pow(temp, count));
            original /= 10;
        }

        if (number == sum) {
            System.out.println("Number is Armstrong Number");
        } else {
            System.out.println("Number Is not an Armstrong Number");
        }

        sc.close();
    }
}
