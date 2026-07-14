import java.sql.*;

public class InsertRecord {
    public static void main(String[] args) throws SQLException {

        // 1) Register The Jdbc User
        Driver d = new oracle.jdbc.OracleDriver();
        DriverManager.registerDriver(d);

        // 2) Create ( or ) establish the connection

        String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";
        String username = "chmallikharjun";
        String password = "Welcome1";
        Connection con = DriverManager.getConnection(url, username, password);

        // 3) Create Statement object
        Statement smt = con.createStatement();

        // 4) execute the sql query
        int feedback = smt.executeUpdate(
                "INSERT INTO employees VALUES " +
                        "(116, 'Arjun Reddy', 'Marketing', 47000, " +
                        "TO_DATE('14-JUN-23','DD-MON-RR'), " +
                        "'Kurnool')");

        if (feedback > 0) {
            System.out.println("Insert Successful");
        } else {
            System.out.println("Insert Not Successful");
        }

        // 5) Close The Connection
        smt.close();
        con.close();
    }
}
