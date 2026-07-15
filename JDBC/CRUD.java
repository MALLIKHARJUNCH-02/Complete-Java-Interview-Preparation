import java.sql.*;
import java.sql.Date;
import java.util.*;

public class CRUD {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);

            System.out.println("Enter The Operation You Want to Perform On the Database");
            System.out.println("Insert - ( 1 )");
            System.out.println("Update - ( 2 )");
            System.out.println("Delete - ( 3 )");
            int choice = sc.nextInt();

            Driver d = new oracle.jdbc.OracleDriver();
            DriverManager.registerDriver(d);

            String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";
            String username = "chmallikharjun";
            String password = "Welcome1";

            con = DriverManager.getConnection(url, username, password);
            stmt = con.createStatement();
            int n = 0;
            switch (choice) {
                case 1:
                    System.out.println("Enter the Employee Id");
                    int emp_id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter The Employee Name");
                    String emp_name = sc.nextLine();
                    System.out.println("Enter The USer Department : ");
                    String department = sc.nextLine();
                    System.out.println("Enter The Salary");
                    double salary = sc.nextDouble();
                    // System.out.print("Enter Hire Date (yyyy-MM-dd) ex: (15-JAN-24): ");
                    // String inputDate = sc.nextLine();

                    // Date hire_date = Date.valueOf(inputDate);

                    sc.nextLine();
                    System.out.println("Enter The Employee City");
                    String city = sc.nextLine();

                    n = stmt.executeUpdate(
                            "Insert into employees values (" + emp_id + ",'" + emp_name + "','" + department
                                    + "'," + salary + ",'14-JUN-2','" + city + "')");

                    if (n > 0) {
                        System.out.println("Inserted The Record");
                    } else {
                        System.out.println("Record is Not Inserted");
                    }
                    break;
                case 2:
                    System.out.println("Enter What do You Want TO Update");
                    System.out.println("Employee Id ( 1 )");
                    System.out.println("Employee Name ( 2 )");
                    System.out.println("Employee Department ( 3 )");
                    System.out.println("Employee Salary ( 4 )");
                    // System.out.println("Employee Hire Date ( 5 )");
                    System.out.println("Employee City ( 6 )");
                    int updateChoice = sc.nextInt();

                    System.out.println("Enter The Employee Id");
                    int updateEmployeeId = sc.nextInt();
                    sc.nextLine();

                    switch (updateChoice) {
                        case 1:
                            System.out.println("Enter The New Employee Id : ");
                            int newEmployeeId = sc.nextInt();
                            n = stmt.executeUpdate("UPDATE employees set emp_id = " + newEmployeeId + " where emp_id = "
                                    + updateEmployeeId);
                            if (n > 0) {
                                System.out.println("Record Updated");
                            } else {
                                System.out.println("Record Not Updated");
                            }
                            break;
                        case 2:
                            System.out.println("Enter The New Employee Name: ");
                            String newEmployeeName = sc.nextLine();
                            n = stmt.executeUpdate("UPDATE employees set emp_name = '" + newEmployeeName
                                    + "' where emp_id = " + updateEmployeeId);
                            if (n > 0) {
                                System.out.println("Record Updated");
                            } else {
                                System.out.println("Record Not Updated");
                            }
                            break;

                        case 3:
                            System.out.println("Enter The New Employee Department : ");
                            String newEmployeeDepartment = sc.nextLine();
                            n = stmt.executeUpdate("UPDATE employees set department = '" + newEmployeeDepartment
                                    + "' where emp_id = " + updateEmployeeId);

                            if (n > 0) {
                                System.out.println("Record Updated");
                            } else {
                                System.out.println("Record Not Updated");
                            }
                            break;

                        case 4:
                            System.out.println("Enter The New Employee Salary : ");
                            double newEmployeeSalary = sc.nextDouble();
                            n = stmt.executeUpdate("UPDATE employees set salary = " + newEmployeeSalary
                                    + " where emp_id = " + updateEmployeeId);

                            if (n > 0) {
                                System.out.println("Record Updated");
                            } else {
                                System.out.println("Record Not Updated");
                            }
                            break;

                        // case 5:
                        // System.out.println("Enter The New Employee Hire Date : ");
                        // System.out.print("Enter Hire Date (yyyy-MM-dd) ex: (15-JAN-24): ");
                        // String NewInputDate = sc.nextLine();

                        // Date NewHireDate = Date.valueOf(NewInputDate);

                        // n = stmt.executeUpdate("UPDATE employees set hire_date = " + NewHireDate
                        // + " where emp_id = " + updateEmployeeId);
                        // break;

                        case 6:
                            System.out.println("Enter The New Employee City : ");
                            String newEmployeeCity = sc.nextLine();
                            n = stmt.executeUpdate("UPDATE employees set city = '" + newEmployeeCity
                                    + "'where emp_id = " + updateEmployeeId);

                            if (n > 0) {
                                System.out.println("Record Updated");
                            } else {
                                System.out.println("Record Not Updated");
                            }
                            break;

                        default:
                            System.out.println("No Such Records");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Enter the Employee Id That Wanted to Delete");
                    int deleteEmployeeId = sc.nextInt();
                    n = stmt.executeUpdate("delete from employees where emp_id = " + deleteEmployeeId);
                    if (n > 0) {
                        System.out.println("Record Deleted");
                    } else {
                        System.out.println("Record Not Deleted");
                    }
                    break;
                default:
                    System.out.println("No such Operations");
                    break;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            try {

                if (stmt != null) {
                    stmt.close();
                }

                if (con != null) {
                    con.close();
                }

                if (sc != null) {
                    sc.close();
                }
            } catch (Exception e) {
            }
        }
    }
}
