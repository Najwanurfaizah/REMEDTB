import java.sql.*;


public class LaundryDatabase {
    
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/laundry";
    private static final String USER = "username";
    private static final String PASSWORD = "password";

    // Set JDBC driver
    public static void setJdbcDriver() {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        setJdbcDriver(); // Ensure the driver is set before establishing a connection
        return DriverManager.getConnection(DB_URL, USER, PASSWORD);
    }




public static void createTransactionTable() {
    try (Connection connection = getConnection();
         Statement statement = connection.createStatement()) {

        System.out.println("Tabel transaksi telah dibuat atau sudah ada.");
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

@Override
public String toString() {
    return "LaundryDatabase []";
}
}

