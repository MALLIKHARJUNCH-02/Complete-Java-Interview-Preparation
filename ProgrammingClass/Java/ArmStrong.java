import java.util.Scanner;

class CheckLength {
    public int countDigits(int num) {

        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}

class CheckArmstrong extends CheckLength {
    public boolean checkArmstrongNumber(int num) {
        if (num == 0) {
            return true;
        }
        int original = num;
        int sum = 0;
        int digits = countDigits(num);
        while (num != 0) {
            int temp = num % 10;
            sum += Math.pow(temp, digits);
            num /= 10;
        }

        return sum == original;
    }
}

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckArmstrong cam = new CheckArmstrong();

        System.out.println("Enter The Lower Range : ");
        int lowerRange = sc.nextInt();

        System.out.println("Enter The Higher Range : ");
        int higherRange = sc.nextInt();

        for (int i = lowerRange; i <= higherRange; i++) {
            if (cam.checkArmstrongNumber(i)) {
                System.out.print(i + "\t");
            }
        }

        sc.close();
    }
}
