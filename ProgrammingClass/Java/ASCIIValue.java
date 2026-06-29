import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The character : ");
        char ch = sc.next().charAt(0);

        int ASCII = ch;
        System.out.println(ch + " : " + ASCII);

        sc.close();
    }
}
