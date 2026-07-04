import java.util.Scanner;

class Employee {
    int employeeId;
    String employeeName;
    double salary;

    Scanner sc = new Scanner(System.in);

    void employeeDetails() {
        System.out.print("Enter Employee ID: ");
        employeeId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
        sc.nextLine();
    }

    void displayEmployeeDetails() {
        System.out.println("Employee ID      : " + employeeId);
        System.out.println("Employee Name    : " + employeeName);
        System.out.println("Salary           : " + salary);
    }
}

class SoftwareDeveloper extends Employee {

    String programmingLanguage;
    String projectName;

    void developerDetails() {
        System.out.print("Enter Programming Language: ");
        programmingLanguage = sc.nextLine();

        System.out.print("Enter Project Name: ");
        projectName = sc.nextLine();
    }

    void displayDeveloperDetails() {
        System.out.println("\n===== Software Developer =====");
        displayEmployeeDetails();

        System.out.println("Programming Language : " + programmingLanguage);
        System.out.println("Project Name         : " + projectName);
    }
}

class Tester extends Employee {

    String testingTool;
    String testingType;

    void testerDetails() {
        System.out.print("Enter Testing Tool: ");
        testingTool = sc.nextLine();

        System.out.print("Enter Testing Type: ");
        testingType = sc.nextLine();
    }

    void displayTesterDetails() {
        System.out.println("\n===== Tester =====");
        displayEmployeeDetails();

        System.out.println("Testing Tool : " + testingTool);
        System.out.println("Testing Type : " + testingType);
    }
}

public class HierarchicalInheritanceExample {

    public static void main(String[] args) {

        SoftwareDeveloper developer = new SoftwareDeveloper();

        developer.employeeDetails();
        developer.developerDetails();
        developer.displayDeveloperDetails();

        System.out.println();

        Tester tester = new Tester();

        tester.employeeDetails();
        tester.testerDetails();
        tester.displayTesterDetails();
    }
}
