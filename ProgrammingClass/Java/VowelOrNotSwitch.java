import java.util.Scanner;

public class VowelOrNotSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The character : ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            ch = Character.toLowerCase(ch);
            switch (ch) {
                // case 'a':
                // System.out.println(ch + " Is Vowel");
                // break;
                // case 'e':
                // System.out.println(ch + " Is Vowel");
                // break;
                // case 'i':
                // System.out.println(ch + " Is Vowel");
                // break;
                // case 'o':
                // System.out.println(ch + " Is Vowel");
                // break;
                // case 'u':
                // System.out.println(ch + " Is Vowel");
                // break;
                // default:
                // System.out.println(ch + " Is a consonant");
                // break;

                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is a Vowel");
                    break;

                default:
                    System.out.println(ch + " is a Consonant");
            }
        } else {
            System.out.println(ch + " Is Not an Alphabet");
        }

        sc.close();
    }
}
