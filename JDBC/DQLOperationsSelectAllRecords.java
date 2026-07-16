import java.sql.*;

public class DQLOperationsSelectAllRecords {
    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {

            String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";
            String username = "chmallikharjun";
            String password = "Welcome1";

            con = DriverManager.getConnection(url, username, password);

            stmt = con.createStatement();

            rs = stmt.executeQuery("select * from employees");

            while (rs.next()) {
                System.out.print(rs.getInt("emp_id") + "\t");
                System.out.print(rs.getString("emp_name") + "\t");
                System.out.print(rs.getString("department") + "\t");
                System.out.print(rs.getDouble("salary") + "\t");
                System.out.print(rs.getDate("hire_date") + "\t");
                System.out.println(rs.getString("city"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }

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
