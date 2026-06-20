import java.util.Scanner;

public class GreaterofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number A ");
        int a = sc.nextInt();

        System.out.println("Enter the number B ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " Is Greatest");
        } else {
            System.out.println(b + " Is Greatest");
        }

        sc.close();
    }
}
