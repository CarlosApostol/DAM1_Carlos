import utilidades.Utilidades;

public class prueba {
    public static void main(String[] args) {
        String mensaje;

        mensaje = Utilidades.leerCadena("Dame tu cadena: ");

        System.out.println(mensaje.length());

    }
}

