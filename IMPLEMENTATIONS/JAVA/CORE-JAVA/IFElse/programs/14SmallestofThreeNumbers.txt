import java.util.Scanner;

public class SmallestofThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number A : ");
        int a = sc.nextInt();

        System.out.println("Enter The Number B : ");
        int b = sc.nextInt();

        System.out.println("Enter The Number C : ");
        int c = sc.nextInt();

        if (a < b && a < c) {
            System.out.println("A is Smallest");
        } else if (b < a && b < c) {
            System.out.println("B is Smallest");
        } else if (c < a && c < b) {
            System.out.println("C is Smallest");
        } else {
            System.out.println("Two or more numbers are equal");
        }

        sc.close();
    }
}
