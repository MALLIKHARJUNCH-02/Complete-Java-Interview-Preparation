import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A : ");
        int a = sc.nextInt();

        System.out.println("Enter B : ");
        int b = sc.nextInt();

        System.out.println("Enter C : ");
        int c = sc.nextInt();

        if ((a > b && a < c) || (a < b && a > c)) {
            System.out.println("A is Second Largest");
        } else if ((b > a && b < c) || (b < a && b > c)) {
            System.out.println("B is Second Largest");
        } else if ((c > a && c < b) || (c < a && c > b)) {
            System.out.println("C is Second Largest");
        } else {
            System.out.println("One or more numbers are equal");
        }

        sc.close();
    }
}
