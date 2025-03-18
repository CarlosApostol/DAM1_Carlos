package BASES_DE_DATOS;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    static java.sql.Connection con;

    static {
        try {
            con = DatabaseConnection.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
    Statement st = null;
    String sql = "CREATE TABLE empleados (" +
            " num INTEGER PRIMARY KEY, " +
            " nombre VARCHAR(255), " +
            " departamento INTEGER, " +
            " edad INTEGER, " +
            " sueldo REAL);";
    try {
        st = con.createStatement();
        st.executeUpdate(sql);
    } catch (SQLException ex) {
        System.out.println("Error "+ex.getMessage());
    } finally {
        try {
            if (st != null && !st.isClosed()) {
                st.close();
            }
        } catch (SQLException ex) {
            System.out.println("No se ha podido cerrar el Statement por alguna razón");
        }
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException ex) {
            System.out.println("No se ha podido cerrar el Connection por alguna razón");
        }
    }
    }
}
