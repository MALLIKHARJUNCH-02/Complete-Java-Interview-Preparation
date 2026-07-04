import java.util.Scanner;

public class LeapYearorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Year : ");
        int year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " Is a Leap Year");
        } else {
            System.out.println(year + " Is Not a Leap Year");
        }

        sc.close();
    }
}
