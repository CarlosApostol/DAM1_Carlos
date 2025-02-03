package POO_Ejercicio5;
import java.util.*;

class Client {
    String dni;
    private Set<Prestec> prestecs;
    private Set<CompteCorrent> compteCorrents;

    public Client(String dni) {
        this.dni = dni;
        this.prestecs = new HashSet<>();
        this.compteCorrents = new HashSet<>();
    }

    public String getDni() {
        return dni;
    }

    public void addPrestecs(Prestec prestec) {
        this.prestecs.add(prestec);
    }
    public void addCompteCorrent(CompteCorrent compteCorrent) {
        this.compteCorrents.add(compteCorrent);
    }
    @Override
    public String toString() {
        return this.dni +"\n\t"+ " PRESTAMOS: " + prestecs+"\n\t"+compteCorrents;
    }
}
