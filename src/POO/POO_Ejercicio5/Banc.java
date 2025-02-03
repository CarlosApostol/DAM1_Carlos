package POO_Ejercicio5;
import java.util.HashSet;
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

    @Override
    public String toString() {
        return "BANCO: " + this.codbanc + "\n\t" + "SUCURSALES: " + sucursales;
    }
}
