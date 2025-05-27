import java.sql.*;

public class BankTransfer {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "yourpassword");
        conn.setAutoCommit(false);

        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE accounts SET balance = balance - 1000 WHERE id = 1");
            stmt.executeUpdate("UPDATE accounts SET balance = balance + 1000 WHERE id = 2");
            conn.commit();
            System.out.println("Transfer successful.");
        } catch (SQLException e) {
            conn.rollback();
            System.out.println("Transfer failed. Transaction rolled back.");
        } finally {
            conn.setAutoCommit(true);
        }
    }
}

