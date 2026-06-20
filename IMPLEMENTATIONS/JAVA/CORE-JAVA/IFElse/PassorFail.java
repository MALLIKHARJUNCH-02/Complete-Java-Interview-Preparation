import java.util.Scanner;

public class PassorFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Average Marks");
        int avg = sc.nextInt();

        if(avg >=40){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        sc.close();
    }
}
