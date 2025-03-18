package BASES_DE_DATOS.Ejercicio;

import java.sql.*;

public class ListarArticulosCategorias {
    public static void ejecutar(Connection con) {
        String sql = "SELECT a.cod_a, a.descrip, a.preu, c.descripcio "
                + "FROM ARTICLE a JOIN CATEGORIA c ON a.cod_cat = c.cod_cat";
        try (Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.printf("\n%-8s %-30s %-8s %-30s%n",
                    "Código", "Descripción", "Precio", "Categoría");
            while (rs.next()) {
                System.out.printf("%-8d %-30s %-8.2f %-30s%n",
                        rs.getInt("cod_a"),
                        rs.getString("descrip"),
                        rs.getDouble("preu"),
                        rs.getString("descripcio"));
            }
        } catch (SQLException e) {
            System.err.println("Error listando artículos: " + e.getMessage());
        }
    }
}
