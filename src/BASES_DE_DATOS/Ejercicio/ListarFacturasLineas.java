package BASES_DE_DATOS.Ejercicio;

import java.sql.*;

public class ListarFacturasLineas {
    public static void ejecutar(Connection con) {
        String sql = "SELECT f.num_f, f.data, l.num_l, l.cod_a, l.quant, l.preu "
                + "FROM FACTURA f JOIN LINIA_FAC l ON f.num_f = l.num_f";
        try (Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.printf("\n%-8s %-12s %-6s %-8s %-8s %-8s%n",
                    "Factura", "Fecha", "Línea", "Artículo", "Cantidad", "Precio");
            while (rs.next()) {
                System.out.printf("%-8d %-12s %-6d %-8d %-8d %-8.2f%n",
                        rs.getInt("num_f"),
                        rs.getDate("data"),
                        rs.getInt("num_l"),
                        rs.getInt("cod_a"),
                        rs.getInt("quant"),
                        rs.getDouble("preu"));
            }
        } catch (SQLException e) {
            System.err.println("Error listando facturas: " + e.getMessage());
        }
    }
}