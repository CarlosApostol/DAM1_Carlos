package BASES_DE_DATOS.Ejercicio;

import BASES_DE_DATOS.DatabaseConnection;
import java.sql.*;
import java.util.Scanner;

public class Aplicacion {
    private static final Scanner scanner = new Scanner(System.in);
    private static Connection con;

    public static void main(String[] args) {
        try {
            con = DatabaseConnection.getConnection();
           Menu();
        } catch (SQLException e) {
            System.err.println("Error de conexión: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
    }

    private static void Menu() {
        int opcion;
        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Listar Clientes");
            System.out.println("2. Listar Facturas con Líneas");
            System.out.println("3. Listar Artículos y Categorías");
            System.out.println("4. Agregar Cliente (se debe hacer en el archivo con el mismo nombre)");
            System.out.println("5. Agregar Artículo (se debe hacer en el archivo con el mismo nombre)");
            System.out.println("6. Eliminar Artículo");
            System.out.println("7. Modificar Precio de Artículo");
            System.out.println("8. Agregar Población (se debe hacer en el archivo con el mismo nombre)");
            System.out.println("9. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> ListarClientes.ejecutar(con);
                case 2 -> ListarFacturasLineas.ejecutar(con);
                case 3 -> ListarArticulosCategorias.ejecutar(con);
                case 4 -> AgregarCliente.ejecutar(con, scanner);
                case 5 -> AgregarArticulo.ejecutar(con, scanner);
                case 6 -> EliminarArticulo.ejecutar(con, scanner);
                case 7 -> ModificarPrecioArticulo.ejecutar(con, scanner);
                case 8 -> AgregarPoblacion.ejecutar(con, scanner);
                case 9 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida");
            }
        } while (opcion != 9);
    }

    private static void cerrarConexion() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException e) {
            System.err.println("Error cerrando conexión: " + e.getMessage());
        }
    }
}
