import java.util.Scanner;

public class Multipleof3and5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " is Multiple of Both 3 and 5");
        } else {
            System.out.println(num + " Is not multiple of 3 and five");
        }

        sc.close();
    }
}


// Write a Java program to check whether a number is:

// a multiple of both 3 and 5,
// a multiple of only 3,
// a multiple of only 5,
// or neither a multiple of 3 nor 5.

// if (num % 3 == 0 && num % 5 == 0) {
//             System.out.println(num + " is Multiple of Both 3 and 5");
//         } else if (num % 3 == 0) {
//             System.out.println(num + " is Multiple of Only 3 but Not 5");
//         } else if(num % 5 == 0){
//             System.out.println(num + " is Multiple of Only 5 but Not 3");
//         }else{
//             System.out.println(num + " Is not multiple of 3 and five");
//         }
