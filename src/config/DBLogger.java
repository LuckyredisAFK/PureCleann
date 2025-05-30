package config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class DBLogger {

    // Static method to log actions
    public static void log(String username, String message, int userId) {
        String query = "INSERT INTO tbl_logs (user_name, action, log_time, u_id) VALUES (?, ?, ?, ?)";
        try (Connection con = connectDB.getConnection();
             PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setString(1, username); // Log the username
            pstmt.setString(2, message);   // Log the action message
            pstmt.setTimestamp(3, new Timestamp(System.currentTimeMillis())); // Current timestamp
            pstmt.setInt(4, userId);       // Set the user ID

            pstmt.executeUpdate();  // Execute the insert statement
        } catch (SQLException e) {
            System.err.println("Failed to log action for user: " + username + " - Action: " + message);
            e.printStackTrace();
        }
    }
}
