import java.util.Scanner;

class CheckPrime {

    public boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;

    }

}

public class PrimeInFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CheckPrime cp = new CheckPrime();

        System.out.println("Enter The Higher Range : ");
        int higherRange = sc.nextInt();

        int first = 0;
        int second = 1;

        while (true) {

            int temp = first + second;
            if (temp > higherRange) {
                break;
            }

            if (cp.isPrime(temp)) {
                System.out.print(temp + "\t");
            }

            first = second;
            second = temp;
        }

        sc.close();
    }
}
