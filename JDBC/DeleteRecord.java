import java.sql.*;
import java.util.Scanner;

public class DeleteRecord {
    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;

        try {
            Driver d = new oracle.jdbc.OracleDriver();
            DriverManager.registerDriver(d);

            String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";
            String username = "chmallikharjun";
            String password = "Welcome1";
            con = DriverManager.getConnection(url, username, password);
            stmt = con.createStatement();

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter The Employee Id Which You Want To Delete : ");
            int emp_id = sc.nextInt();
            
            int n = stmt.executeUpdate("delete from employees where emp_id = " + emp_id);

            if (n > 0) {
                System.out.println("Record Deleted");
            } else {
                System.out.println("Record Not Deleted");
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
            } catch (SQLException e) {
            }
        }
    }
}
