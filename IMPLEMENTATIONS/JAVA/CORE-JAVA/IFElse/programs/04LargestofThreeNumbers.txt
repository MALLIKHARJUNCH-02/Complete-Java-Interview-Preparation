import java.util.Scanner;

public class LargestofThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The A Value : ");
        int a = sc.nextInt();

        System.out.println("Enter The B Value : ");
        int b = sc.nextInt();

        System.out.println("Enter The C Value : ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " A Is Greatest");
        } else if (b > a && b > c) {
            System.out.println(b + " B is Greatest");
        } else {
            System.out.println(c + " C Is Greatest");
        }

        sc.close();

    }
}
