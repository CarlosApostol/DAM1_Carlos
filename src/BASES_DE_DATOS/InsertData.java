package BASES_DE_DATOS;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
    static java.sql.Connection con;

    static {
        try {
            con = DatabaseConnection.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        PreparedStatement st = null;
        String sql = "INSERT INTO empleados (num, nombre, departamento, edad, sueldo) VALUES (?, ?, ?, ?, ?)";

        try {
            st = con.prepareStatement(sql);

            st.setInt(1, 1);
            st.setString(2, "Andreu");
            st.setInt(3, 32);
            st.setInt(4, 31);
            st.setDouble(5, 1000.0);
            st.executeUpdate();

            st.setInt(1, 2);
            st.setString(2, "Bernat");
            st.setInt(3, 28);
            st.setInt(4, 28);
            st.setDouble(5, 1200.0);
            st.executeUpdate();

            st.setInt(1, 3);
            st.setString(2, "Claudia");
            st.setInt(3, 40);
            st.setInt(4, 35);
            st.setDouble(5, 1400.0);
            st.executeUpdate();

            st.setInt(1, 4);
            st.setString(2, "Damián");
            st.setInt(3, 35);
            st.setInt(4, 30);
            st.setDouble(5, 1300.0);
            st.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Error "+ ex.getMessage());
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

