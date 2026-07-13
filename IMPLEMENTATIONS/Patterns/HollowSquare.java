import java.util.*;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The height : ");
        int height = sc.nextInt();

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < height; j++) {

                if (j > 0 && j < height - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("[" + i + "] [" + j + "]" );
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
