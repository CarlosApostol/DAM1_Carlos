package BASES_DE_DATOS.Ejercicio;

import java.sql.*;

public class ListarClientes {
    public static void ejecutar(Connection con) {
        String sql = "SELECT * FROM CLIENT";
        try (Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.printf("\n%-6s %-20s %-30s %-4s %-8s%n",
                    "Código", "Nombre", "Dirección", "CP", "Población");
            while (rs.next()) {
                System.out.printf("%-6d %-20s %-30s %-4d %-8d%n",
                        rs.getInt("cod_cli"),
                        rs.getString("nom"),
                        rs.getString("adreca"),
                        rs.getInt("cp"),
                        rs.getInt("cod_pob"));
            }
        } catch (SQLException e) {
            System.err.println("Error listando clientes: " + e.getMessage());
        }
    }
}
