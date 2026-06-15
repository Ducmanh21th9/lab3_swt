import java.sql.*;

class SQLInjectionExample {
    public static void main(String[] args) throws SQLException {
        String userInput = "john_doe";
        String query = "SELECT * FROM users WHERE username = ?";

        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost/db", "user", "pass");
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, userInput);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("username"));
            }
        }
    }
}