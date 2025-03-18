package BASES_DE_DATOS.Ejercicio;

import java.sql.*;
import java.util.Scanner;

public class AgregarArticulo {
    public static void ejecutar(Connection con, Scanner scanner) {
        try {
            System.out.print("\nCódigo artículo: ");
            int cod = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Descripción: ");
            String desc = scanner.nextLine();
            System.out.print("Precio: ");
            double precio = scanner.nextDouble();
            System.out.print("Stock: ");
            int stock = scanner.nextInt();
            System.out.print("Stock mínimo: ");
            int stockMin = scanner.nextInt();
            System.out.print("Código categoría: ");
            int codCat = scanner.nextInt();

            String sql = "INSERT INTO ARTICLE (cod_a, descrip, preu, stock, stock_min, cod_cat) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, cod);
                ps.setString(2, desc);
                ps.setDouble(3, precio);
                ps.setInt(4, stock);
                ps.setInt(5, stockMin);
                ps.setInt(6, codCat);
                ps.executeUpdate();
                System.out.println("Artículo agregado correctamente");
            }
        } catch (SQLException e) {
            System.err.println("Error agregando artículo: " + e.getMessage());
        }
    }
}