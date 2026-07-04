import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Employee Salary : ");
        double salary = sc.nextDouble();
        double taxAmount = 0;
        if (salary >= 25000) {
            taxAmount = salary * 0.13;
        } else {
            System.out.println("NO Tax");
        }

        System.out.println("Total Tax Amount : " + taxAmount);
        System.out.println("Total In Hand Salary : " + (salary - taxAmount));

        sc.close();
    }
}
