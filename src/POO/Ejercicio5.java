package POO;
import java.util.*;

class Banc {
    String codbanc;
    private Set<Sucursal> sucursales;

    public Banc(String codbanc) {
        this.codbanc = codbanc;
        this.sucursales = new HashSet<>();
    }

    public String getCodbanc() {
        return codbanc;
    }

    public void addSucursal(Sucursal sucursal) {
        this.sucursales.add(sucursal);
    }

    public String toString() {
        return "BANCO: " + this.codbanc + "\n\t"+"SUCURSALES: " + sucursales;
    }
}

class Sucursal {
    String nsuc;
    private Set<CompteCorrent> comptecorrents;

    public Sucursal(String nsuc) {
        this.nsuc = nsuc;
        this.comptecorrents = new HashSet<>();
    }

    public String getNsuc() {
        return nsuc;
    }

    public void addCompteCorrent(CompteCorrent comptecorrent) {
        this.comptecorrents.add(comptecorrent);
    }

    public String toString() {
        return this.nsuc + "\n\t"+"CUENTAS: " + comptecorrents;
    }
}

class CompteCorrent {
    String ncc;
    private Set<Domiciliacio> domiciliacions;
    private Set<Client> clients;

    public CompteCorrent(String ncc) {
        this.ncc = ncc;
        this.domiciliacions = new HashSet<>();
        this.clients = new HashSet<>();
    }

    public String getNcc() {
        return ncc;
    }

    public void addDomiciliacions(Domiciliacio domiciliacio) {
        this.domiciliacions.add(domiciliacio);
    }

    public void addClients(Client client) {
        this.clients.add(client);
    }

    public String toString() {
        return this.ncc + "\n\t"+"CLIENTES: " + clients + "\n\tDOMICILIACIONES: " + domiciliacions;
    }
}

class Domiciliacio {
    String nd;

    public Domiciliacio(String nd) {
        this.nd = nd;
    }

    public String getNd() {
        return nd;
    }

    public String toString() {
        return this.nd;
    }
}

class Prestec {
    String np;

    public Prestec(String np) {
        this.np = np;
    }

    public String getNp() {
        return np;
    }

    public String toString() {
        return this.np;
    }
}

class Client {
    String dni;
    private Set<Prestec> prestecs;

    public Client(String dni) {
        this.dni = dni;
        this.prestecs = new HashSet<>();
    }

    public String getDni() {
        return dni;
    }

    public void addPrestecs(Prestec prestec) {
        this.prestecs.add(prestec);
    }

    public String toString() {
        return this.dni + " PRESTAMOS: " + prestecs;
    }
}

public class Ejercicio5 {
    public static void main(String[] args) {
        Banc banco1 = new Banc("BANCO123");

        Sucursal sucursal1 = new Sucursal("SUC1");
        Sucursal sucursal2 = new Sucursal("SUC2");

        banco1.addSucursal(sucursal1);
        banco1.addSucursal(sucursal2);

        CompteCorrent cuenta1 = new CompteCorrent("CC1");
        CompteCorrent cuenta2 = new CompteCorrent("CC2");
        CompteCorrent cuenta3 = new CompteCorrent("CC3");

        sucursal1.addCompteCorrent(cuenta1);
        sucursal1.addCompteCorrent(cuenta2);
        sucursal2.addCompteCorrent(cuenta3);

        Client cliente1 = new Client("12345678A");
        Client cliente2 = new Client("23456789B");

        Prestec prestamo1 = new Prestec("P1");
        Prestec prestamo2 = new Prestec("P2");

        Domiciliacio domiciliacion1 = new Domiciliacio("D1");
        Domiciliacio domiciliacion2 = new Domiciliacio("D2");

        cuenta1.addClients(cliente1);
        cuenta2.addClients(cliente2);

        cliente1.addPrestecs(prestamo1);
        cliente2.addPrestecs(prestamo2);

        cuenta1.addDomiciliacions(domiciliacion1);
        cuenta2.addDomiciliacions(domiciliacion2);

        System.out.println(banco1);
    }
}
