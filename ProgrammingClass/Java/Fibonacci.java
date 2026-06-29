import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Higher Range : ");
        int higherRange = sc.nextInt();

        int first = 0;
        int second = 1;

        System.out.print(first + " ");
        System.out.print(second + " ");

        while (true) {
            int next = first + second;

            if (next > higherRange)
                break;

            System.out.print(next + " ");

            first = second;
            second = next;
        }

        sc.close();
    }
}