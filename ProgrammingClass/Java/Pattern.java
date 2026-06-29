import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int total = rows * (rows + 1) / 2;
        int start = total - rows + 1;

        for (int i = rows; i >= 1; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print((start + j) + "\t");
            }

            System.out.println();

            start = start - (i - 1);
        }

        sc.close();
    }
}