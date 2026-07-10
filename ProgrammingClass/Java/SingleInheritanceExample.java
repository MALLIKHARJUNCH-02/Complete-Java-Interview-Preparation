// import java.util.Scanner;

// class Employee {
//     int employeeId;
//     String employeeName;
//     double salary;
//     Scanner sc = new Scanner(System.in);

//     public void employeeDetails() {
//         System.out.println("Enter Employee Id : ");
//         employeeId = sc.nextInt();

//         sc.nextLine();
//         System.out.println("Enter Employee Name : ");
//         employeeName = sc.nextLine();

//         System.out.println("Enter Employee salary : ");
//         salary = sc.nextDouble();

//         sc.nextLine();
//     }

//     public void displayEmployeeDetails() {
//         System.out.println("Employee Id : " + employeeId);
//         System.out.println("Employee Name : " + employeeName);
//         System.out.println("Employee Salary : " + salary);
//     }

// }

// class SoftwareDeveloper extends Employee {
//     String programmingLanguage;
//     String projectName;

//     void developerDetails() {
//         System.out.print("Enter Programming Language: ");
//         programmingLanguage = sc.nextLine();

//         System.out.print("Enter Project Name: ");
//         projectName = sc.nextLine();
//     }

//     void displayDeveloperDetails() {
//         System.out.println("\n========== Developer Details ==========");
//         displayEmployeeDetails();
//         System.out.println("Programming Language : " + programmingLanguage);
//         System.out.println("Project Name         : " + projectName);
//     }
// }

// public class SingleInheritanceExample {
//     public static void main(String[] args) {

//         SoftwareDeveloper sd = new SoftwareDeveloper();

//         sd.employeeDetails();

//         sd.developerDetails();

//         sd.displayDeveloperDetails();
//     }
// }
