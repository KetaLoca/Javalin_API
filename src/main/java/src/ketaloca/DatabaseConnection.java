package src.ketaloca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://localhost:4000/postgres?sslmode=disable";
    private static final String USER = "postgres";
    private static final String PASSWORD = "1234";

    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

        try (PreparedStatement stmt = connection.prepareStatement("SET search_path TO \"CrazyWeekEnd\"")) {
            stmt.execute();
        }

        return connection;
    }
}
