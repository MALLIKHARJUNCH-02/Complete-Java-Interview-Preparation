import java.util.Scanner;

public class Dividedby3and5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Lower Range : ");
        int lowerRange = sc.nextInt();

        System.out.println("Enter The Higher Range : ");
        int higherRange = sc.nextInt();

        System.out.println("Divide by 3");
        for (int i = lowerRange; i <= higherRange; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " ");
            }
        }

        System.out.println("Divide by 5");
        for (int i = lowerRange; i <= higherRange; i++) {
            if (i % 5 == 0) {
                System.out.println(i + " ");
            }
        }

        System.out.println("Divide by 3 and 5");
        for (int i = lowerRange; i <= higherRange; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i + " ");
            }
        }

        sc.close();
    }
}
