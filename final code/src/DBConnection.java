import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    // --- IMPORTANT: UPDATE THESE VALUES ---
    private static final String URL = "jdbc:mysql://localhost:3306/event_management_db";
    private static final String USER = "root"; // e.g., "root"
    private static final String PASSWORD = "sql";

    /**
     * Establishes a connection to the database.
     * @return a Connection object
     * @throws SQLException if a database access error occurs
     */
    public static Connection getConnection() throws SQLException {
        try {
            // This line loads the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
            throw new SQLException("MySQL JDBC Driver not found.", e);
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}