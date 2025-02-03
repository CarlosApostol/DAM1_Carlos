package POO_Ejercicio5;
import java.util.*;

class Domiciliacio {
    String nd;

    public Domiciliacio(String nd) {
        this.nd = nd;
    }

    public String getNd() {
        return nd;
    }
    @Override
    public String toString() {
        return this.nd+"\n\t";
    }
}
