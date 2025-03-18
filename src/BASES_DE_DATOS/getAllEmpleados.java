package BASES_DE_DATOS;

import java.sql.*;

public class getAllEmpleados {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            con = DatabaseConnection.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM empleados");

            System.out.println("Núm. \tNombre \tDep \tEdad \tSueldo");
            System.out.println("-----------------------------------------");

            while (rs.next()) {
                System.out.print(rs.getInt(1)+ "\t\t");
                System.out.print(rs.getString(2)+ "\t ");
                System.out.print(rs.getInt(3)+ "\t     ");
                System.out.print(rs.getInt(4)+ "\t    ");
                System.out.println(rs.getDouble(5));
            }
        } catch (SQLException e) {
            System.out.println("Se ha producido un error al leer los empleados. Mensaje: "+e.getMessage());
        } finally {
            try {
                if (st != null && !st.isClosed()) {
                    st.close();
                }
            } catch (SQLException ex) {
                System.out.println("Se ha producido un error al cerrar el Statment: "+ex.getMessage());
            }
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                System.out.println("Se ha producido un error al cerrar el ResultSet: "+ex.getMessage());
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
