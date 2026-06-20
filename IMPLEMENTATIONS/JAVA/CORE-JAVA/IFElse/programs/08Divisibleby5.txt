import java.util.Scanner;

public class Divisibleby5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number ");
        int num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.println(num + " Divisible by 5 ");
        } else {
            System.out.println(num + " Is Not Divisible by 5 ");
        }

        sc.close();
    }
}
