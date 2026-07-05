import java.util.Scanner;

public class EmployeeTax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Employee Salary : ");
        double salary = sc.nextDouble();

        double tax = 0.0;
        double finalCtc;

        if (salary >= 3000000) {
            System.out.println("35% Tax");
            tax = (35 / 100.0) * salary;
        } else if (salary >= 2000000) {
            System.out.println("30% Tax");
            tax = (30 / 100.0) * salary;

        } else if (salary >= 1500000) {
            System.out.println("25% Tax");
            tax = (25 / 100.0) * salary;

        } else if (salary >= 1000000) {
            System.out.println("20% Tax");
            tax = (20 / 100.0) * salary;

        } else if (salary >= 700000) {
            System.out.println("15% Tax");
            tax = (15 / 100.0) * salary;

        } else if (salary >= 500000) {
            System.out.println("10% Tax");
            tax = (10 / 100.0) * salary;

        } else if (salary >= 300000) {
            System.out.println("5% Tax");
            tax = (5 / 100.0) * salary;

        } else {
            System.out.println("No Tax");
            tax = 0.0;
        }

        finalCtc = salary - tax;

        System.out.println("Tax Amount : " + tax);
        System.out.println("Final CTC : " + finalCtc);

        sc.close();
    }
}