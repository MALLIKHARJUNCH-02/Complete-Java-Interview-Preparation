import java.util.Scanner;

public class ArmStrongorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int number = sc.nextInt();

        int original = number;
        int numberCopy = number;
        int len = 0;

        if (numberCopy == 0) {
            len = 1;
        } else {
            while (numberCopy != 0) {
                numberCopy /= 10;
                len++;
            }
        }

        numberCopy = number;
        int armStrong = 0;

        if (numberCopy == 0) {
            armStrong = 0;
        } else {
            while (numberCopy != 0) {
                int digit = numberCopy % 10;
                armStrong += (int) Math.pow(digit, len);
                numberCopy /= 10;
            }
        }

        if (original == armStrong) {
            System.out.println(original + " Is an Armstrong Number");
        } else {
            System.out.println(original + " Is Not an Armstrong Number");
        }

        sc.close();
    }
}