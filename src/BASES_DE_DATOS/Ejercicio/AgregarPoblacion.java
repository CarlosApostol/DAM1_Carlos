package BASES_DE_DATOS.Ejercicio;

import java.sql.*;
import java.util.Scanner;

public class AgregarPoblacion {
    public static void ejecutar(Connection con, Scanner scanner) {
        try {
            System.out.print("\nCódigo de población: ");
            int cod = scanner.nextInt();

            String sql = "INSERT INTO POBLE (cod_pob) VALUES (?)";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, cod);
                ps.executeUpdate();
                System.out.println("Población agregada correctamente");
            }
        } catch (SQLException e) {
            System.err.println("Error agregando población: " + e.getMessage());
        }
    }
}
