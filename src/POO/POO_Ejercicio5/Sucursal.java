package POO_Ejercicio5;
import java.util.*;

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
    @Override
    public String toString() {
        return this.nsuc + "\n\t"+"CUENTAS: " + comptecorrents;
    }
}
