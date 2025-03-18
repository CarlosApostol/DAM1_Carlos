package BASES_DE_DATOS.Ejercicio;

import java.sql.*;
import java.util.Scanner;

public class EliminarArticulo {
    public static void ejecutar(Connection con, Scanner scanner) {
        try {
            System.out.print("\nCódigo del artículo a eliminar: ");
            int cod = scanner.nextInt();

            String sql = "DELETE FROM ARTICLE WHERE cod_a = ?";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, cod);
                int affected = ps.executeUpdate();
                if (affected > 0) {
                    System.out.println("Artículo eliminado correctamente");
                } else {
                    System.out.println("No se encontró el artículo");
                }
            }
        } catch (SQLException e) {
            System.err.println("Error eliminando artículo: " + e.getMessage());
        }
    }
}