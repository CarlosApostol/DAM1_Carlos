package BASES_DE_DATOS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://89.36.214.106/f_1cfsy_7629d";
    private static final String USER = "f_1cfsy_7629d";
    private static final String PASSWORD = "f_1cfsy_7629d";

    // Método para obtener la conexión
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
