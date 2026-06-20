import java.util.Scanner;

public class Divisibleby10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number : ");
        int num = sc.nextInt();

        if (num % 10 == 0) {
            System.out.println(num + " Is Divisible by 10");
        } else {
            System.out.println(num + " Is Not Divisible by 10");
        }

        sc.close();
    }
}


