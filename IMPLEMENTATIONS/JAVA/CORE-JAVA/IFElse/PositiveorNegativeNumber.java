import java.util.Scanner;

public class PositiveorNegativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number : ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Negative Number");
        } else if (num > 0) {
            System.out.println("Positive Number");
        } else {
            System.out.println("Zero");
        }

        sc.close();
    }
}
