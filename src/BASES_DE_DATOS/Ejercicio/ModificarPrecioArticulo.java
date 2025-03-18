package BASES_DE_DATOS.Ejercicio;

import java.sql.*;
import java.util.Scanner;

public class ModificarPrecioArticulo {
    public static void ejecutar(Connection con, Scanner scanner) {
        try {
            System.out.print("\nCódigo del artículo: ");
            int cod = scanner.nextInt();
            System.out.print("Nuevo precio: ");
            double precio = scanner.nextDouble();

            String sql = "UPDATE ARTICLE SET preu = ? WHERE cod_a = ?";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setDouble(1, precio);
                ps.setInt(2, cod);
                int affected = ps.executeUpdate();
                if (affected > 0) {
                    System.out.println("Precio actualizado correctamente");
                } else {
                    System.out.println("No se encontró el artículo");
                }
            }
        } catch (SQLException e) {
            System.err.println("Error actualizando precio: " + e.getMessage());
        }
    }
}