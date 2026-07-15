import java.sql.*;

public class UpdateRecord {
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

            int n = stmt.executeUpdate("UPDATE employees set emp_name = 'Mallikharjun' where emp_id = 116");

            if (n > 0) {
                System.out.println("Updated Record");
            } else {
                System.out.println("Not Update");
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
