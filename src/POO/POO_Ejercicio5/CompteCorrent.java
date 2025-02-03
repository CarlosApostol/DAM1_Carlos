package POO_Ejercicio5;
import java.util.*;

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

    @Override
    public String toString() {
        return this.ncc + "\n\t" + "CLIENTES: " + clients +"\n\t"+ " DOMICILIACIONES: " + domiciliacions;
    }
}
