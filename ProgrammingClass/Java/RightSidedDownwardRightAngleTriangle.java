import java.util.Scanner;

public class RightSidedDownwardRightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Height ");
        int height = sc.nextInt();

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            for (int j = height - 1; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
