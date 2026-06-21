// import java.util.Scanner;

// public class UppercaseorLowercase {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the Character");
//         char ch = sc.next().charAt(0);

//         if(ch >= 'A' && ch <= 'Z'){
//              System.out.println(ch + " is Upper Case");
//         }else if(ch >= 'a' && ch <= 'a'){
//              System.out.println(ch + " is Lower Case");
//         }else{
//              System.out.println(ch + " is Not an Alphabet");
//         }

//         sc.close();
//     }
// }

import java.util.Scanner;

public class UppercaseorLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Character");
        char ch = sc.next().charAt(0);

        if(Character.isUpperCase(ch)){
             System.out.println(ch + " is Upper Case");
        }else if(Character.isLowerCase(ch)){
             System.out.println(ch + " is Lower Case");
        }else{
             System.out.println(ch + " is Not an Alphabet");
        }

        sc.close();
    }
}
