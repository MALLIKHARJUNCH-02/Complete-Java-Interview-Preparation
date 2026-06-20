import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " Is Even");
        } else {
            System.out.println(num + " Is Odd");
        }

        sc.close();
    }
}
