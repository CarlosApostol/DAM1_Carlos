package POO_Ejercicio5;

import java.util.*;
public class Ejercicio5 {
    public static void main(String[] args) {
        Banc banco1 = new Banc("BANCO123");

        Sucursal sucursal1 = new Sucursal("SUC1");

        banco1.addSucursal(sucursal1);

        CompteCorrent cuenta1 = new CompteCorrent("CC1");

        sucursal1.addCompteCorrent(cuenta1);

        Client cliente1 = new Client("12345678A");

        Prestec prestamo1 = new Prestec("P1");

        Domiciliacio domiciliacion1 = new Domiciliacio("D1");

        cuenta1.addClients(cliente1);

        cliente1.addPrestecs(prestamo1);

        cuenta1.addDomiciliacions(domiciliacion1);

        System.out.println(banco1);
    }
}
