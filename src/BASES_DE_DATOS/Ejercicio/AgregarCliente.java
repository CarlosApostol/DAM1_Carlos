package BASES_DE_DATOS.Ejercicio;

import java.sql.*;
import java.util.Scanner;

public class AgregarCliente {
    public static void ejecutar(Connection con, Scanner scanner) {
        try {
            System.out.print("\nCódigo cliente: ");
            int cod = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Dirección: ");
            String direccion = scanner.nextLine();
            System.out.print("CP: ");
            int cp = scanner.nextInt();
            System.out.print("Código población: ");
            int codPob = scanner.nextInt();

            String sql = "INSERT INTO CLIENT (cod_cli, nom, adreca, cp, cod_pob) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, cod);
                ps.setString(2, nombre);
                ps.setString(3, direccion);
                ps.setInt(4, cp);
                ps.setInt(5, codPob);
                ps.executeUpdate();
                System.out.println("Cliente agregado");
            }
        } catch (SQLException e) {
            System.err.println("Error agregando cliente: " + e.getMessage());
        }
    }
}
